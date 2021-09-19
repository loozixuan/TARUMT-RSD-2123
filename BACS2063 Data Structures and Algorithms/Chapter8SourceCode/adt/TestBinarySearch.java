package adt;

import java.util.*;

public class TestBinarySearch {

    public static void main(String[] args) {
        SortedListInterface<Integer> numList = new SortedArrayList<Integer>();
//    Scanner scanner = new Scanner(System.in);
//
//    for (int i = 10; i <= 1000; i += 2) {
//      numList.add(i);
//    }
//
//    System.out.println("numList contains: \n" + numList);
//
//    System.out.print("\nEnter a target number, 0 to exit: ");
//    int target = scanner.nextInt();
//    while (target != 0) {
//      System.out.println("\nnumList contains " + target + ": " + numList.contains(target));
//      System.out.print("Enter a target number, 0 to exit: ");
//      target = scanner.nextInt();
//    }
//
//    System.out.println();
//
//  }
        numList.add(1);
        System.out.println(numList.contains(1));
    }
}
