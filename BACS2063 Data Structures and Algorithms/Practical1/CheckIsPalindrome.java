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

public class CheckIsPalindrome {

    public static boolean isPalindrome(String input) {
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();

        input = input.replaceAll("[^A-Za-z]+", ""); //remove whitespace and punctuation from string

        char character;
        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            if (Character.isLetter(character)) {
                character = Character.toUpperCase(character);
                q.add(character);
                s.push(character);
            }
        }

        while (!q.isEmpty()) {
            if (!q.remove().equals(s.pop())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        System.out.print("Enter a string: ");
        string = scan.nextLine();

        if (isPalindrome(string)) {
            System.out.println(string + " is a palindrome.");
        } else {
            System.err.println(string + " is not a palindrome.");
        }
    }
}
