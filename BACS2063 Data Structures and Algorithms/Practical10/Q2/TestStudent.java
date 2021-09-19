/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import entity.Student;

/**
 *
 * @author Loo Zi Xuan
 */
public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student(1111222233334444L, "Jack Ryan", 3.25);
        System.out.println("Student : " + student);
        System.out.println("Hashcode : " + student.hashCode());
    }
}
