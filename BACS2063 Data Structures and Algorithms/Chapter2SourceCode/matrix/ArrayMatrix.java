/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ //        ArrayMatrix arrMatrix = new ArrayMatrix(((ArrayMatrix) anotherMatrix).dimension);
package matrix;

/**
 *
 * @author Loo Zi Xuan
 */
public class ArrayMatrix implements SquareMatrix {

    private int[][] matrixArray;
    private int dimension;

    public ArrayMatrix(int n) {
        matrixArray = new int[n][n];
        dimension = n;
    }

    @Override
    public void makeEmpty(int m) {

        for (int row = 0; row <= m; row++) {
            for (int col = 0; col <= m; col++) {
                matrixArray[row][col] = 0;
            }
        }

    }

    @Override
    public boolean storeValue(int i, int j, int value) {
        matrixArray[i][j] = value;
        return true;
    }

    @Override
    public boolean add(SquareMatrix anotherMatrix) {

        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                matrixArray[row][col] = matrixArray[row][col]
                        + ((ArrayMatrix) anotherMatrix).matrixArray[row][col];
            }
        }
        return true;
    }

    @Override
    public boolean copy(SquareMatrix anotherMatrix) {
        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                matrixArray[row][col] = ((ArrayMatrix) anotherMatrix).matrixArray[row][col];
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String output = "";
        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                output += String.format("%4d", matrixArray[row][col]);
            }
            output += "\n";
        }
        return output;
    }

}
