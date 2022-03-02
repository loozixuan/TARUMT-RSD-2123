//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

contract Greeter{
    string public yourName;

    constructor (){
        yourName = "world 123";
    }

    function setName(string memory _name) public{
        yourName = _name;
    }

    function hello() view public returns(string memory){ 
        return yourName;
    }
}