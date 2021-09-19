package adt;

import java.util.Iterator;

public class CLinkedQueue<T> implements QueueInterface<T> {

    private Node lastNode; //references node at back of queue

    public CLinkedQueue() {
        lastNode = null;
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry, null);
        if (isEmpty()) {
            newNode.next = newNode; //point to itself
        } else {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        }
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        T result = null;
        if (!isEmpty()) {
            result = lastNode.next.data;
            if (lastNode.next == lastNode) {    //check if it points to itself
                lastNode = null;
            } else {
                lastNode.next = lastNode.next.next;
            }
        }
        return result;
    }

    @Override
    public T getFront() {
        T result = null;
        if (!isEmpty()) {
            result = lastNode.next.data;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return lastNode == null;
    }

    @Override
    public void clear() {
        lastNode = null;
    }

    @Override
    public Iterator<T> getIterator() {
        return new CLinkedQueueIterator();
    }

    private class CLinkedQueueIterator implements Iterator<T> {

        private Node currentNode;

        public CLinkedQueueIterator() {
            currentNode = lastNode.next;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T returnData = currentNode.data;
                currentNode = currentNode.next;
                return returnData;
            } else {
                return null;
            }
        }
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
