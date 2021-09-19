package samplecode;

import java.util.Scanner;

public class CountDown4 {
  
  // Iterative implementation of countDown
  public void countDown(int n) {
    while (n >= 1) {
      System.out.println(n);
      n--;
    }
  } 
  
  public static void main(String[] args) {
    CountDown c = new CountDown();
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a non-negative integer number: ");
    int number = scanner.nextInt();
    
    System.out.printf("\nOutput for countDown(%d):\n", number);
    c.countDown(number);
 
  }
}
