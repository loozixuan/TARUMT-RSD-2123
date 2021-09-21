/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.CircularArrayQueue;
import adt.QueueInterface;
import entity.*;

/**
 *
 * @author Loo Zi Xuan
 */
public class TestCircularArray {

    private QueueInterface<Property> o = new CircularArrayQueue<>();

    public void display() {
        o.enqueue(new Property("1", "aasd"));
        o.enqueue(new Property("2", "aasd"));
        o.enqueue(new Property("3", "aasd"));
        System.out.println(o.getFront());
    }

    public static void main(String[] args) {
        TestCircularArray t = new TestCircularArray();
        t.display();
    }
}
