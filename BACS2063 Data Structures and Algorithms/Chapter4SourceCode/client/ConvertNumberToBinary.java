/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.Stack;

/**
 *
 * @author Loo Zi Xuan
 */
public class ConvertNumberToBinary {

    private Stack<Integer> numList = new Stack<>();

    public static void main(String[] args) {
        ConvertNumberToBinary c = new ConvertNumberToBinary();
        System.out.println(c.convertNumberToBinary(3));
    }

    public String convertNumberToBinary(int number) {
        int remainder;
        String str = "";
        while (number != 0) {
            remainder = number % 2;
            numList.push(remainder);
            number = number / 2;
        }

        while (!numList.empty()) {
            str += numList.pop() + "";
        }

        return str;
    }
}
