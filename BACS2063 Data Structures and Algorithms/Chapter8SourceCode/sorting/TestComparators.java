package sorting;

import entity.TitleComparator;
import entity.CreditHoursComparator;
import entity.Course;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Kat Tan
 */
public class TestComparators {
  
  public static void display(List aList) {
    Iterator iterator = aList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public static void main(String[] args) {
    List<Course> courseList = new ArrayList<>();
    courseList.add(new Course("BAIT2183", "Software Security", 3));
    courseList.add(new Course("BACS2063", "Data Structures and Algorithms", 3));
    courseList.add(new Course("BAIT3343", "Agile Software Development", 3));
    courseList.add(new Course("AACS2204", "Object-Oriented Programming Techniques", 4));
    courseList.add(new Course("AACS1074", "Programming Concepts and Design I", 4));
    courseList.add(new Course("AACS2182", "ADIS Case Study", 2));
    
    Collections.sort(courseList);
    System.out.println("\nCourse List (sorted by course CODE):");
    display(courseList);
    
    Collections.sort(courseList, new TitleComparator());
    System.out.println("\nCourse List (sorted by course TITLE):");
    display(courseList);
    
    Collections.sort(courseList, new CreditHoursComparator());
    System.out.println("\nCourse List (sorted by CREDIT HOURS):");
    display(courseList);
  }
  
}
