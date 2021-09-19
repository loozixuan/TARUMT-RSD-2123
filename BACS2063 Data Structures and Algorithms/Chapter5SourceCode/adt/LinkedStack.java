package adt;

public class LinkedStack<T> implements StackInterface<T> {

    private Node topNode; //reference to first node

    public LinkedStack() {
        topNode = null;
    }

    @Override
    public void push(T newEntry) {
        Node newNode = new Node(newEntry);
        newNode.next = topNode;
        topNode = newNode;
    }

    @Override
    public T pop() {
        T result = peek();
        if (topNode != null) {
            topNode = topNode.next;
        }
        return result;
    }

    @Override
    public T peek() {
        T result = null;
        if (topNode != null) {
            result = topNode.data;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
