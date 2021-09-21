/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.ArraySet;
import adt.SetInterface;
import java.util.Iterator;

/**
 *
 * @author Loo Zi Xuan
 */
public class TestSet {

    public static void main(String[] args) {
        SetInterface<Integer> setA = new ArraySet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(5);
        setA.add(5);

        SetInterface<Integer> setB = new ArraySet<>();
        setB.add(1);
        setB.add(9);

        System.out.println("Set A : " + setA.toString());
        System.out.println("Set B : " + setB.toString());

        System.out.println("Element that set A intesect with set B : " + setA.intersection(setB));
        System.out.println("Is set B subset of set A : " + setA.checkSubset(setB));
        System.out.print("Union of set A and Set B : ");
        setA.union(setB);
        System.out.println("Set A : " + setA.toString());
        int counter = 0;
        Iterator<Integer> sInterator = setA.getIterator();
        while (sInterator.hasNext()) {
            sInterator.next();
            counter++;
        }
        System.out.println("counter of set A: " + counter);
    }
}
