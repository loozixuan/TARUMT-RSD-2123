package sorting;

// BubbleSort.java
// - Demonstrates the bubble sort algorithm on an array of integers
public class BubbleSort {

  public static void bubbleSort(int[] a, int n) {
    boolean sorted = false;
    for (int pass = 1; pass < n && !sorted; pass++) {
      sorted = true;
      for (int index = 0; index < n - pass; index++) {
        // swap adjacent elements if first is greater than second
        if (a[index] > a[index + 1]) {
          swap(a, index, index + 1); // swap adjacent elements 
          sorted = false;  // array not sorted because a swap was performed
        }
      } 
      System.out.print("After pass " + pass + ": ");  // trace statement
      display(a, n);                                  // trace statement
    } 
  } 

  // helper method to swap values in two array elements
  public static void swap(int[] array, int first, int second) {
    int temporary = array[first]; // store first in temporary
    array[first] = array[second]; // replace first with second
    array[second] = temporary; // put temporary in second
  } // end method swap

  public static void display(int[] array, int n) {
    for (int element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  } 

  public static void main(String[] args) {
    int[] numberArray = {23, 78, 45, 8, 32, 56};

    bubbleSort(numberArray, numberArray.length);
    System.out.print("After bubbleSort(): ");
    display(numberArray, numberArray.length);
  }

}
