/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Loo Zi Xuan
 */
public class TestMatrix {

    public static void main(String[] args) {
        SquareMatrix m1 = new ArrayMatrix(2);
        SquareMatrix m2 = new ArrayMatrix(2);
        SquareMatrix m3 = new ArrayMatrix(3);

        System.out.println(m1.storeValue(0, 0, 1));
        System.out.println(m1.storeValue(0, 1, 1));
        System.out.println(m1.storeValue(1, 0, 5));
        System.out.println(m1.storeValue(1, 1, 5));
        System.out.println(m2.storeValue(0, 0, 1));
        System.out.println(m2.storeValue(0, 1, 1));
        System.out.println(m2.storeValue(1, 0, 5));
        System.out.println(m2.storeValue(1, 1, 5));
        System.out.println(m2.add(m1));
        m2.makeEmpty(0);
        System.out.println(m2.toString());
    }
}
