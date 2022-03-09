//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;
// import "https://github.com/OpenZeppelin/openzeppelin-contracts/blob/master/contracts/token/ERC20/ERC20.sol";

contract Coin{
    address public minter;
    mapping (address => uint) balances;

    constructor (){
        minter = msg.sender;
    }

    // only called by minter
    function mint(address receiver, uint amount) public{
        if (msg.sender != minter)
            return;

        balances[receiver] = amount;
    }

    // called by other accounts
    function send(address receiver, uint amount) public{
        if(balances[msg.sender] < amount)
            return;
        
        balances[msg.sender] -= amount;
        balances[receiver] += amount;

        emit sent(msg.sender, receiver, amount);
    }

    event sent(address from, address to, uint amount);
}