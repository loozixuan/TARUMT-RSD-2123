package samplecode;

import java.util.Scanner;

public class CountDown3 {

    public void countDown(int n) {
        System.out.println(n);
        if (n > 1) {
            countDown(n - 1); //recursive call
        }
    }

    public void countUp(int n) { // Q1
        if (n > 1) {
            countUp(n - 1);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        CountDown3 c = new CountDown3();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer number: ");
        int number = scanner.nextInt();

        System.out.printf("\nOutput for countDown(%d):\n", number);
        c.countDown(number);

        System.out.printf("\nOutput for countUp(%d):\n", number);
        c.countUp(number);
    }
}
