package client;

import adt.CLinkedQueue;
import adt.QueueInterface;

public class TestCircularLinkedQueue {

    public static void main(String[] args) {
        System.out.println("Create a Queue: ");

        QueueInterface<String> myQueue = new CLinkedQueue<>();

        System.out.println("\nIs empty() returns " + myQueue.isEmpty() + "\n");

        System.out.println("Add to queue to get\n" + "Joe Jane Jill Jess Jim\n");
        myQueue.enqueue("Joe");
        myQueue.enqueue("Jane");
        myQueue.enqueue("Jill");
        myQueue.enqueue("Jess");
        myQueue.enqueue("Jim");

        System.out.println("\nIs empty() returns " + myQueue.isEmpty() + "\n");

        System.out.println("Testing getFront() and dequeue:\n");
        while (!myQueue.isEmpty()) {
            String top = myQueue.getFront();
            System.out.print(top + " is at the front of the queue\n");
            top = myQueue.dequeue();
            System.out.print(top + " is removed from the front of the queue\n");
            System.out.println("");
        }

        System.out.println("\nIs empty() returns " + myQueue.isEmpty() + "\n");
    }
}
