package sorting;

public class SortArray {

    private static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * ********************* Bubble Sort ******************************
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] a, int n) {
        boolean sorted = false;
        for (int pass = 1; pass < n && !sorted; pass++) {
            sorted = true;
            for (int index = 0; index < n - pass; index++) {
                // swap adjacent elements if first is greater than second
                if (a[index].compareTo(a[index + 1]) > 0) {
                    swap(a, index, index + 1); // swap adjacent elements
                    sorted = false;  // array not sorted because a swap was performed
                }
            }
        }
    }

    /**
     * ********************* Quick Sort ******************************
     */
    public static <T extends Comparable<T>> void quickSort(T[] a, int n) {
        quickSort(a, 0, n - 1);
    }

    // recursive private overloaded method quickSort()
    private static <T extends Comparable<T>> void quickSort(T[] a, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(a, first, last);
            quickSort(a, first, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, last);
        }
    }

    // private method partition() - to partition the array based on the pivot value
    private static <T extends Comparable<T>> int partition(T[] a, int first, int last) {
        int pivotIndex = last;
        T pivot = a[last];
        int indexFromLeft = first;
        int indexFromRight = last - 1;
        boolean done = false;

        while (!done) {
            while (indexFromLeft < last && a[indexFromLeft].compareTo(pivot) < 0) {
                indexFromLeft++;
            }

            while (indexFromRight > first && a[indexFromRight].compareTo(pivot) > 0) {
                indexFromRight--;
            }

            if (indexFromLeft < indexFromRight) {
                swap(a, indexFromLeft, indexFromRight);
                indexFromLeft++;
                indexFromRight--;
            } else {
                done = true;
            }
        }
        swap(a, pivotIndex, indexFromLeft);
        pivotIndex = indexFromLeft;
        return pivotIndex;
    }

    /**
     * Practical 8 Q3: Selection Sort (swapping)
     */
    private static <T extends Comparable<T>> void selectionSort(T[] a, int n) {
        for (int index = 0; index < n - 1; index++) {
            int indexOfNextSmallest = getIndexSmallest(a, index, n - 1);
            swap(a, index, indexOfNextSmallest);
        }
    }

    //returns the index of the smallest entry in the subarray first...last
    private static <T extends Comparable<T>> int getIndexSmallest(T[] a, int first, int last) {
        T min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (a[index].compareTo(min) < 0) {
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    /**
     * Practical 8 Q4: Insertion Sort (shirting)
     */
    private static <T extends Comparable<T>> void insertionSort(T[] a, int n) {
        for (int unsorted = 1; unsorted < n; unsorted++) {
            T firstUnsorted = a[unsorted];
            insertInOrder(firstUnsorted, a, unsorted - 1);
        }
    }

    //inserts element at the correct index within thes sorted subarray
    private static <T extends Comparable<T>> int insertInOrder(T element, T[] a, int end) {
        int index = end;
        while ((index >= 0) && (element.compareTo(a[index]) < 0)) {
            a[index + 1] = a[index]; //shifting
            index--;
        }
        a[index + 1] = element;
        return 0;
    }

    public static <T> void printArray(T[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] nameArray = {"Dan", "Ann", "Zoe", "Jet", "Ben"};

        // Test bubblesort
        System.out.print("Before bubblesort: ");
        printArray(nameArray);
        bubbleSort(nameArray, nameArray.length);
        System.out.print("After bubblesort : ");
        printArray(nameArray);

        Integer[] numArray = {90, 40, 10, 30, 20, 50};

        System.out.print("\nBefore bubblesort: ");
        printArray(numArray);
        bubbleSort(numArray, numArray.length);
        System.out.print("After bubblesort : ");
        printArray(numArray);

        // Test quicksort
        Integer[] numArray2 = {3, 5, 0, 4, 6, 1, 2, 4};
        System.out.print("\nBefore quicksort: ");
        printArray(numArray2);
        quickSort(numArray2, numArray2.length);
        System.out.print("After quicksort : ");
        printArray(numArray2);
    }

}
