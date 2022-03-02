//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

contract MyContractStruct{

    struct Person{
        string firstName;
        string lastName;
        string email;
    }

    Person[] public people;
    uint public peopleCount;

    function addPeople(string memory _fName, string memory _lName, string memory _email) public{
        people.push(Person(_fName,_lName,_email));
        peopleCount++;
    }
}