//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;
import "@openzeppelin/contracts/utils/math/SafeMath.sol";
import "./IERC20.sol";

contract DragonSwap{
    using SafeMath for uint256;

    IERC20 public token1;
    IERC20 public token2;
    uint256 ETH_Token;     // ERC-20 Token
    uint256 DRG_Token;     // ERC-20 Token
    string name1;
    string name2;
    uint8 decimal;

    struct LiquidityPool{
        uint256 total_token_1;
        uint256 total_token_2;
        uint256 total_LPTokens;
        uint256 K;  // constant from xyk model
    }

    mapping (address => uint) public LP_Tokens;  // store the LP token for each provider
    mapping (address => uint) public token_1_balance;  // store token 1 balance of each user (LP provider / trader)
    mapping (address => uint) public token_2_balance;  // store token 2 balance of each user (LP provider / trader)
    LiquidityPool public liquidityPool;     // represent the pool

    constructor(){
        liquidityPool.total_token_1 = 100; 
        liquidityPool.total_token_2 = 250; 
        liquidityPool.K = liquidityPool.total_token_1 * liquidityPool.total_token_2;
        token_1_balance[msg.sender] = 10000;
        token_2_balance[msg.sender] = 10000;
        liquidityPool.total_LPTokens=liquidityPool.total_token_1 +liquidityPool.total_token_2;
    }

    // Ensures that the _qty is non-zero and the user has enough balance
    modifier validAmountCheck(mapping(address => uint256) storage _balance, uint256 _qty) {
        require(_qty > 0, "Amount cannot be zero!"); //entered amount cannot be 0
        require(_qty <= _balance[msg.sender], "Insufficient amount"); //entered amount must less than or equal to sender balance
        _;
    }

    // Ensure the pool have token 1 and token 2 balances
    modifier activePool() {
        require(liquidityPool.K > 0, "Zero Liquidity");
        _;
    }

    function getProviderLPToken() external view returns(uint256){
        return LP_Tokens[msg.sender];
    }

    // Returns the total amount of tokens locked in the pool and the total shares issued corresponding to it
    function getPoolDetails() external view returns(uint256, uint256, uint256) {
        return (liquidityPool.total_token_1, liquidityPool.total_token_2, liquidityPool.total_LPTokens);
    }

    function LPToken(uint256 _amountToken1, uint256 _amountToken2) external pure returns(uint256 amountLPToken) {
        amountLPToken = _amountToken1 + _amountToken2;
        return amountLPToken;
    }

    // Returns the balance of the user
    function checkMyBalances() external view returns(uint256 amountToken1, uint256 amountToken2, uint256 LP_Token) {
        amountToken1 = token_1_balance[msg.sender];
        amountToken2 = token_2_balance[msg.sender];
        LP_Token = LP_Tokens[msg.sender];
    }

    /* Provide more token 1 and token 2 into the pool - Expands the pool
    ** 1. Calculate LP token for LP provider 
    ** 2. Reduce amount token1 and token2 from user balances
    ** 3. Increase the total amount token 1 and token 2
    ** 4. Calculate new constant
    ** 5. Increase total amount of LP tokens in pool
    ** 6. Assign the LP token calculated into user's LP token balances
    */ 
    function provideLiquidity(uint256 _amountToken1, uint256 _amountToken2) validAmountCheck(token_1_balance, _amountToken1) validAmountCheck(token_2_balance, _amountToken2) public returns(uint256 LP_token){

        LP_token = _amountToken1 + _amountToken2;

        require(LP_token > 0, "Asset value less than threshold for contribution!");
        token_1_balance[msg.sender] -= _amountToken1;
        token_2_balance[msg.sender] -= _amountToken2;

        liquidityPool.total_token_1 += _amountToken1;
        liquidityPool.total_token_2 += _amountToken2;

        liquidityPool.K = liquidityPool.total_token_1.mul(liquidityPool.total_token_2);

        liquidityPool.total_LPTokens += LP_token;
        LP_Tokens[msg.sender] += LP_token;
    }

    // Returns the estimate of Token1 & Token2 that will be released on burning given _LPToken
     function getWithdrawTokenEstimate(uint256 _LPToken) public view returns(uint256 amountToken1, uint256 amountToken2) {
        require(_LPToken <=LP_Tokens[msg.sender] , "Entered LP Token should be less than total LP Token of provider");
        amountToken1 = _LPToken.mul(liquidityPool.total_token_1).div(liquidityPool.total_LPTokens); //used entered token, provider may not withdraw all the coin
        amountToken2 = _LPToken.mul(liquidityPool.total_token_2).div(liquidityPool.total_LPTokens);
    }


    // Removes liquidity from the pool and releases corresponding Token1 & Token2 to the withdrawer
    // _LPToken :entered by provider
    // LP_Tokens:LP Token owned by provider
    function withdraw(uint256 _LPToken) external activePool validAmountCheck(LP_Tokens, _LPToken) returns(uint256 amountToken1, uint256 amountToken2) {
        (amountToken1, amountToken2) = getWithdrawTokenEstimate(_LPToken);
        
        LP_Tokens[msg.sender] -= _LPToken;
        liquidityPool.total_LPTokens -= _LPToken;

        liquidityPool.total_token_1 -= amountToken1;
        liquidityPool.total_token_2 -= amountToken2;
        liquidityPool.K= liquidityPool.total_token_1.mul(liquidityPool.total_token_2);

        token_1_balance[msg.sender] += amountToken1;
        token_2_balance[msg.sender] += amountToken2;
    }

    
    // Returns the amount of Token2 that the user will get when swapping a given amount of Token1 for Token2
    function getSwapToken1Estimate(uint256 _amountToken1) public view activePool returns(uint256 amountToken2) {
        uint256 token1After = liquidityPool.total_token_1.add(_amountToken1);
        uint256 token2After = liquidityPool.K.div(token1After);
        amountToken2 = liquidityPool.total_token_2.sub(token2After);

        // To ensure that Token2's pool is not completely depleted leading to inf:0 ratio
        if(amountToken2 == liquidityPool.total_token_2) amountToken2--;
    }
    
    // Swaps given amount of Token1 to Token2 using algorithmic price determination
    function swapToken1(uint256 _amountToken1) external activePool validAmountCheck(token_1_balance, _amountToken1) returns(uint256 amountToken2) {
        amountToken2 = getSwapToken1Estimate(_amountToken1);

        token_1_balance[msg.sender] -= _amountToken1;
        liquidityPool.total_token_1 += _amountToken1;
        liquidityPool.total_token_2 -= amountToken2;
        token_2_balance[msg.sender] += amountToken2;
    }

    // Returns the amount of Token2 that the user will get when swapping a given amount of Token1 for Token2
    function getSwapToken2Estimate(uint256 _amountToken2) public view activePool returns(uint256 amountToken1) {
        uint256 token2After = liquidityPool.total_token_2.add(_amountToken2);
        uint256 token1After = liquidityPool.K.div(token2After);
        amountToken1 = liquidityPool.total_token_1.sub(token1After);

        // To ensure that Token1's pool is not completely depleted leading to inf:0 ratio
        if(amountToken1 == liquidityPool.total_token_1) amountToken1--;
    }
    
    // Swaps given amount of Token2 to Token1 using algorithmic price determination
    function swapToken2(uint256 _amountToken2) external activePool validAmountCheck(token_2_balance, _amountToken2) returns(uint256 amountToken1) {
        amountToken1 = getSwapToken2Estimate(_amountToken2);

        token_2_balance[msg.sender] -= _amountToken2;
        liquidityPool.total_token_2 += _amountToken2;
        liquidityPool.total_token_1 -= amountToken1;
        token_1_balance[msg.sender] += amountToken1;
    }
}
