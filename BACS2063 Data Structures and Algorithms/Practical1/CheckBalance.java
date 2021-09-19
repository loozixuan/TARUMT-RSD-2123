/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loo Zi Xuan
 */
import java.util.*;

public class CheckBalance {

    public static boolean isBalanced(String exp) {
        Stack<Character> s = new Stack<>();
        boolean isBalanced = true;

        for (int i = 0; i < exp.length() && isBalanced; i++) {
            char character = exp.charAt(i);
            switch (character) {
                case '(':
                case '[':
                case '{':
                    s.push(character);
                    break;
                case ')':
                case ']':
                case '}':
                    if (s.empty()) {
                        isBalanced = false;
                    } else {
                        char leftBracket = s.pop();
                        if ((character == '}' && leftBracket != '{') || (character == ']' && leftBracket != '[')
                                || (character == ')' && leftBracket != '(')) {
                            isBalanced = false;
                        }
                    }
                    break;
            }
        }

        if (!s.empty()) {
            isBalanced = false;
        }
        return isBalanced;
    }

    public static void main(String[] args) {
        String input = "{()}";
        if (isBalanced(input)) {
            System.out.println("The expression is balanced");
        } else {
            System.out.println("The expression is not balanced");
        }
    }
}
