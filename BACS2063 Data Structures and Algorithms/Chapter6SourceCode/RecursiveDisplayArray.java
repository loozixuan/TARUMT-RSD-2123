package samplecode;

/**
 * RecursiveDisplayArray.java - Contains 3 recursive methods for displaying
 * arrays: (a) displayArray1 - prints array[first] and recursively print the
 * rest of the array elements (b) displayArray2 - recursively prints
 * array[first..last-1] and then prints array[last] (c) displayArray3 -
 * recursively prints the left subarray and then recursively prints the right
 * subarray
 *
 */
public class RecursiveDisplayArray {

    public static void displayArray(Object[] array) {

        System.out.println("\nInvoking displayArray1()...");
        displayArray1(array, 0, array.length - 1);

        System.out.println("\n\nInvoking displayArray2()...");
        displayArray2(array, 0, array.length - 1);

        System.out.println("\n\nInvoking displayArray3()...");
        displayArray3(array, 0, array.length - 1);

    }

    // Recursively displays array by starting with array[first]
    private static void displayArray1(Object[] array, int first, int last) {
        System.out.print(array[first] + " ");
        if (first < last) {
            displayArray1(array, first + 1, last);
        }
    }

    // Recursively displays array by "starting" with array[last]
    private static void displayArray2(Object[] array, int first, int last) {
        if (first <= last) {
            System.out.print(array[last] + " ");
            displayArray2(array, first, last - 1);
        }
    }

    // Recursively displays array by dividing the array in half
    private static void displayArray3(Object[] array, int first, int last) {
        if (first == last) {
            System.out.print(array[first] + " ");
        } else {
            int mid = (first + last) / 2;
            displayArray3(array, first, mid);
            displayArray3(array, mid + 1, last);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50, 60};

        System.out.println("displayArray(intArray):");
        displayArray(intArray);
        System.out.println("\n");
    }

}
