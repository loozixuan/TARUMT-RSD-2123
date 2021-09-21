/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

public class MainMenu {

    public static void main(String[] args) {
        MaintainOwner m = new MaintainOwner();
        m.addNewOwner();
        m.addPropertyToOwner();
        m.displayOwners();
        m.addPropertyToOwner();
        m.displayOwners();
    }
}
