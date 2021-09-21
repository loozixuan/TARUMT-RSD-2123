/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.*;
import entity.*;
import java.util.Scanner;

public class MaintainOwner {

    private ListInterface<Owner> ownerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public MaintainOwner() {
        initializeOwners();
    }

    private void initializeOwners() {
        ownerList.add(new Owner("Peter"));
        ownerList.add(new Owner("Lily"));
        ownerList.add(new Owner("Mathew"));
        ownerList.add(new Owner("Joanne"));
    }

    public void addNewOwner() {
        System.out.print("Enter owner name: ");
        String name = scanner.nextLine();
        ownerList.add(new Owner(name));
    }

    public void displayOwners() {
        System.out.println("Owner List");
        for (int i = 1; i <= ownerList.getNumberOfEntries(); i++) {
            System.out.println(i + ". " + ownerList.getEntry(i));
            System.out.println("");
        }
    }

    public void addPropertyToOwner() {
        displayOwners();
        System.out.println("Enter liine number: ");
        int line = scanner.nextInt();
        scanner.nextLine();
        Owner owner = ownerList.getEntry(line);
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter property type: ");
        String type = scanner.nextLine();
        Property p = new Property(address, type);
        owner.addProperty(p);
    }
}
