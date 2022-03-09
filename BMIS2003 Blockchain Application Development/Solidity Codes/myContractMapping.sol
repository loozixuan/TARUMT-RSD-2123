//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

contract myContractMapping{

    struct Person{
        address Account;
        uint id;
        string firstName;
        string lastName;
    }

    mapping (address => Person) public people; 
    uint private peopleCount;

    function addPeople(string memory _fName, string memory _lName) public{
        address _acc = msg.sender;
        peopleCount++;
        people[_acc] = Person (_acc, peopleCount, _fName, _lName);
    }
}