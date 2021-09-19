/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import entity.Name;

/**
 *
 * @author Loo Zi Xuan
 */
public class TestName {

    public static void main(String[] args) {
        Name[] nameArr = {
            new Name("a", "A"),
            new Name("b", "B"),
            new Name("c", "C")
        };

        System.out.printf("%-20s %-8s\n", "Name", "Hash Code");
        for (int i = 0; i < nameArr.length; i++) {
            System.out.printf("%-20s %-8d\n", nameArr[i], nameArr[i].hashCode());
        }
    }
}
