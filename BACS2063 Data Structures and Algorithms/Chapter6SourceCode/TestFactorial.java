package samplecode;

import java.util.Scanner;

/**
 * TestFactorial.java A driver program for testing the recursive factorial method.
 * @author Kat Tan
 */
public class TestFactorial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a non-negative integer number: ");
    int number = scanner.nextInt();
    System.out.printf("factorial(%d) = %d\n", number, Factorial.factorial(number));
  }
}
