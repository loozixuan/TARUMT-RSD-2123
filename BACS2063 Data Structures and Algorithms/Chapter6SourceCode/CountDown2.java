package samplecode;

import java.util.Scanner;

public class CountDown2 {

  public void countDown(int n) {
    if (n >= 1) {
      System.out.println(n);
      countDown(n - 1);
    }
  } 

  public static void main(String[] args) {
    CountDown2 c = new CountDown2();
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a non-negative integer number: ");
    int number = scanner.nextInt();

    System.out.printf("\nOutput for countDown(%d):\n", number);
    c.countDown(number);
  }
}
