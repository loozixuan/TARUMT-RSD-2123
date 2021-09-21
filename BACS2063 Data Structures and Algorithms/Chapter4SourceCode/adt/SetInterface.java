/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import java.util.Iterator;

/**
 *
 * @author Loo Zi Xuan
 */
public interface SetInterface<T> {

    public Iterator<T> getIterator();

    public boolean add(T newElement);

    public boolean remove(T anElement);

    public void union(SetInterface anotherSet);

    public SetInterface intersection(SetInterface anotherSet);

    public boolean checkSubset(SetInterface anotherSet);

    public boolean isEmpty();

    public int size();

    public int length();
}
