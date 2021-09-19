package samplecode;

/*
 * SimpleList.java the toString() method invokes a private recursive toString() method
 * @author Kat Tan
 */
public class SimpleList<T> {

    private Node firstNode;

    // Constructor creates a list with the values from the given array
    public SimpleList(T[] initialValues) {
        for (int i = initialValues.length - 1; i >= 0; i--) {
            Node newNode = new Node(initialValues[i]);
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    // Q5
    public int countNode() {
        return countNode(firstNode);
    }

    private int countNode(Node nodeOne) {
        if (nodeOne == null) {
            return 0;
        } else {
            return 1 + countNode(nodeOne.next);
        }
    }

    public static void main(String[] args) {
        String[] fruitArr = {"apple", "orange", "blueberry", "kiwi", "watermelon"};
        SimpleList colorList = new SimpleList(fruitArr);
        System.out.println("colorList:\n" + colorList);
        System.out.println("Total Fruits: " + colorList.countNode());
    }

    @Override
    public String toString() {
        return toString(firstNode);
    }

    private String toString(Node currentNode) {
        if (currentNode == null) {
            return "";
        } else {
            return currentNode.data + "\n" + toString(currentNode.next);
        }
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        } // end constructor

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
