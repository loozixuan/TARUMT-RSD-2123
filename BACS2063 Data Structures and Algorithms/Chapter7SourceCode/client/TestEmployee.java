package client;

import adt.*;
import entity.*;

public class TestEmployee {

    public static void main(String[] args) {
        SortedListInterface<Employee> empList = new SortedArrayList<>();

        empList.add(new Manager(5555, "Jack Lee", 8888.88, 1200.00));
        empList.add(new Clerk(7777, "Lee Hom", 7856.65, 10, 7.90));
        empList.add(new Manager(2222, "Robert Loo", 8888.88, 1200.00));
        empList.add(new Clerk(8888, "John Doe", 7856.65, 10, 7.90));
        System.out.println("empList:\n" + empList);
    }
}
