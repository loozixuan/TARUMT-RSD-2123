package adt;

import java.util.Iterator;

public interface BinarySearchTreeInterface<T extends Comparable<T>> {

    /**
     * * Task: Searches for a specific entry in the tree. * * @param entry an
     * object to be found * @return true if the object was found in the tree
     */
    public boolean contains(T entry);

    /**
     * * Task: Retrieves a specific entry in the tree. * * @param entry an
     * object to be found * @return either the object that was found in the tree
     * or null if no such * object exists
     */
    public T getEntry(T entry);

    /**
     * * Task: Adds a new entry to the tree. If the entry matches an object
     * that * exists in the tree already, replaces the object with the new
     * entry.
     *
     * *
     * @param newEntry an object to be added to the tree * @return either null
     * if newEntry was not in the tree already, or an existing * entry that
     * matched the parameter newEntry and has been replaced in the tree
     */
    public T add(T newEntry);

    /**
     * * Task: Removes a specific entry from the tree. * * @param entry an
     * object to be removed * @return either the object that was removed from
     * the tree or null if no such * object exists
     */
    public T remove(T entry);

    public boolean isEmpty();

    public void clear();

    public Iterator<T> getPreorderIterator();

    public Iterator<T> getPostorderIterator();

    public Iterator<T> getInorderIterator();

    public T getSmallestValue();
}
