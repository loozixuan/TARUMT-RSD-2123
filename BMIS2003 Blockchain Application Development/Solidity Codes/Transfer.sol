//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

contract Transfer{
    address payable public buyer;

    function buyProduct(address payable toReceiver) public payable{
        buyer = payable(msg.sender);

        if(buyer.balance >= (1*10**18)){
            toReceiver.transfer(msg.value);
        }
    }
}