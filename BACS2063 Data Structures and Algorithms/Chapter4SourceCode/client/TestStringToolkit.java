package client;

import java.util.Scanner;
import utility.StringToolkit;

/**
 *
 * @author Kat Tan
 */
public class TestStringToolkit {

  public static void main(String[] args) {
    System.out.print("Enter a string: ");
    Scanner scanner = new Scanner(System.in);
    String aString = scanner.nextLine();
    System.out.println("\nThe reversed string is: " + StringToolkit.reverse(aString));
  }
}
