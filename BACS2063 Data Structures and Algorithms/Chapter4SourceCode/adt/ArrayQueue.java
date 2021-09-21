package adt;

import java.util.Iterator;

/**
 * ArrayQueue.java A class that implements the * ADT array by using an
 * expandable linear array with a fixed front.
 */
public class ArrayQueue<T> implements QueueInterface<T> {

    private T[] array;
    private final static int frontIndex = 0;
    private int backIndex;
    private static final int DEFAULT_CAPACITY = 50;

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayQueue(int initialCapacity) {
        array = (T[]) new Object[initialCapacity];
        backIndex = -1;
    }

    public void enqueue(T newEntry) {
        if (!isArrayFull()) {
            backIndex++;
            array[backIndex] = newEntry;
        }
    }

    public T getFront() {
        T front = null;
        if (!isEmpty()) {
            front = array[frontIndex];
        }
        return front;
    }

    public T dequeue() {
        T front = null;
        if (!isEmpty()) {
            front = array[frontIndex];      // shift remaining array items forward one position
            for (int i = frontIndex; i < backIndex; ++i) {
                array[i] = array[i + 1];
            }
            backIndex--;
        }
        return front;
    }

    public boolean isEmpty() {
        return frontIndex > backIndex;
    }

    public void clear() {
        if (!isEmpty()) { // deallocates only the used portion
            for (int index = frontIndex; index <= backIndex; index++) {
                array[index] = null;
            }
            backIndex = -1;
        }
    }

    private boolean isArrayFull() {
        return backIndex == array.length - 1;
    }

    public Iterator<T> getIterator() {
        return new ArrayQueueIterator();
    }

    private class ArrayQueueIterator implements Iterator<T> {

        private int nextIndex;

        private ArrayQueueIterator() {
            nextIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return nextIndex <= backIndex;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T nextEntry = array[nextIndex];
                nextIndex++; // advance iterator
                return nextEntry;
            } else {
                return null;
            }
        }
    }
}
