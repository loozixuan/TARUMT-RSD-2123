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
public interface SquareMatrix {

    void makeEmpty(int m);

    boolean storeValue(int i, int j, int value);

    boolean add(SquareMatrix anotherMatrix);

    boolean copy(SquareMatrix anotherMatrix);
}
