package samplecode;

import javax.sound.midi.SysexMessage;

public class FindGCD {

    private static int findGCD(int number1, int number2) {
        // base case
        if (number2 == 0) {
            return number1;
        } else {
            return findGCD(number2, number1 % number2);
        }
    }

    public static void main(String[] args) {
        int m = 27, n = 18;
        System.out.printf("gcd(%d, %d) = %d", m, n, findGCD(m, n));
    }
}
