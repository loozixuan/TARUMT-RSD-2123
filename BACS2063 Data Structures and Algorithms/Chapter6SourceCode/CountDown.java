package samplecode;

import java.util.Scanner;

public class CountDown {

  public void countDown(int n) {
    if (n == 1) {
      System.out.println(n);
    } else {
      System.out.println(n);
      countDown(n - 1);
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
