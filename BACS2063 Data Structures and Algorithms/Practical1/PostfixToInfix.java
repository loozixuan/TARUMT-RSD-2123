
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Loo Zi Xuan
 */
public class PostfixToInfix {

    public static void ConvertPostfixToInfix(String exp) {
        Stack<String> stack = new Stack<>();
        String right, left;
        String output;

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch + "");
            } else {
                switch (ch) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        right = stack.pop();
                        left = stack.pop();
                        output = "(" + right + " " + ch + " " + left + ")";
                        stack.push(output);
                }
            }
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
        ConvertPostfixToInfix("62+53*/");
    }

}
