//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

contract Bidder{
    string public name;
    uint public bidAmount;
    bool public eligible;
    uint public minBid;

    address public winnerAddress;
    uint public winnerTimeStamp;

    // This function will called by seller
    function setName(string memory _name, uint _minBid, uint _bidAmount) public{
        name = _name;
        minBid = _minBid;
        bidAmount = _bidAmount;
    }

    // This function will called by buyer
    function setBidAmount(uint _buyerbidAmount) public{
        determineEligibility(_buyerbidAmount);
    }

    function determineEligibility(uint _buyerbidAmount) internal{
        if(_buyerbidAmount >= minBid){
            eligible = true;
            bidAmount += _buyerbidAmount;
            winnerAddress = msg.sender; 
            winnerTimeStamp = block.timestamp;
        }else{
            eligible = false;
        }
    }
}