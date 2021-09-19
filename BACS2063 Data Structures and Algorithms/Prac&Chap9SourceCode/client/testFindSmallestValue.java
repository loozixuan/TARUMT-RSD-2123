/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.BinarySearchTree;
import adt.BinarySearchTreeInterface;
import java.util.Iterator;

/**
 *
 * @author Loo Zi Xuan
 */
public class testFindSmallestValue {

    public static void main(String[] args) {
        BinarySearchTreeInterface<Integer> bTree = new BinarySearchTree<>();
        Integer[] intArr = {1, 23, 40, 30, 50, 60, 2, 3, 4};

        for (int i = 0; i < intArr.length; i++) {
            bTree.add(intArr[i]);
        }

        System.out.println("Value: ");
        Iterator<Integer> iterator = bTree.getInorderIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println("\nThe minimun value is " + bTree.getSmallestValue());
    }
}
