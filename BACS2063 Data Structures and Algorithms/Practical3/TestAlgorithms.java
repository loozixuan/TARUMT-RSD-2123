/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loo Zi Xuan
 */
public class TestAlgorithms {

    private final static String UNIT = "ns";

    public static void main(String[] args) {
        int[] nValues = {10, 100, 1000};
        int iterations = 10;

        String outputStr = String.format("\n\n       Average Running Times(%s) for %d iterations\n", UNIT, iterations);
        outputStr += String.format("%8s %15s %15s %15s\n", "n", "Algorithms A", "Algorithms B", "Algorithms C");

        for (int n : nValues) {
            long timeA = 0;
            long timeB = 0;
            long timeC = 0;
            long avgTimeA = 0;
            long avgTimeB = 0;
            long avgTimeC = 0;

            System.out.printf("\nAlgorithems A(%d)  =  %d", n, Algorithms.algorithmsA(n));
            System.out.printf("\nAlgorithems B(%d)  =  %d", n, Algorithms.algorithmsB(n));
            System.out.printf("\nAlgorithems C(%d)  =  %d", n, Algorithms.algorithmsC(n));

            for (int i = 0; i < iterations; i++) {
                long startTime = System.nanoTime();
                Algorithms.algorithmsA(n);
                long endTime = System.nanoTime();
                timeA += endTime - startTime;

                startTime = System.nanoTime();
                Algorithms.algorithmsB(n);
                endTime = System.nanoTime();
                timeB += endTime - startTime;

                startTime = System.nanoTime();
                Algorithms.algorithmsC(n);
                endTime = System.nanoTime();
                timeC += endTime - startTime;
            }
            avgTimeA = timeA / iterations;
            avgTimeB = timeB / iterations;
            avgTimeC = timeC / iterations;

            outputStr += String.format("%8d %15d %15d %15d\n", n, avgTimeA, avgTimeB, avgTimeC);
            System.out.println(outputStr);
        }
    }
}
