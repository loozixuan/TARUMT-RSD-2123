package client;

import adt.LinkedStack;
import adt.StackInterface;

public class TestLinkedStack {

    public static void main(String[] args) {
        System.out.println("Create a stack: ");

        StackInterface<String> myStack = new LinkedStack<>();

        System.out.println("\nIs empty() returns " + myStack.isEmpty() + "\n");

        System.out.println("Add to stack to get\n" + "Joe Jane Jill Jess Jim\n");
        myStack.push("Joe");
        myStack.push("Jane");
        myStack.push("Jill");
        myStack.push("Jess");
        myStack.push("Jim");

        System.out.println("\nIs empty() returns " + myStack.isEmpty() + "\n");

        System.out.println("Testing peek and pop:\n");
        while (!myStack.isEmpty()) {
            String top = myStack.peek();
            System.out.print(top + " is at the top of the stack\n");
            top = myStack.pop();
            System.out.print(top + " is removed from the stack\n");
            System.out.println("");
        }

        System.out.println("\nIs empty() returns " + myStack.isEmpty() + "\n");
    }
}
