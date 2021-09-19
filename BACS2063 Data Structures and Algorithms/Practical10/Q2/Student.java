package entity;

public class Student {

    private long id;		// Assumption: id is a 4-digit number
    private String name;
    private double cgpa;

    public Student() {
    }

    public Student(long id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int hashCode() { // hashCode directly returns the id
        int total = 0;
        long number = id;
        while (number > 0) {
            total += number % 10000;
            number = number / 10000;
            System.out.println("total : " + total);
            System.out.println("number");
        }
        return total;
    } // end hashCode

    public boolean equals(Object o) {
        if (o == null || !(o instanceof Student)) {
            return false;
        }

        Student s = (Student) o;
        return this.id == s.id;
    }

    public String toString() {
        return String.format("%15d %-20s %10.2f", id, name, cgpa);
    }
}
