package samplecode;

/**
 * TestRecursiveLinkedDisplay.java A driver program to test the recursive toString() method
 * @author Kat Tan
 */
public class TestRecursiveLinkedDisplay {
  public static void main(String[] args) {
    String[] strArr = {"orange", "apple", "durian", "guava", "watermelon"};
    Integer[] yearArr = {2020, 1967, 1957};
    Course[] courseArr = {new Course("BACS2063", "Data Structures and Algorithms", 3), 
                          new Course("BAIT3173", "Integrative Programming", 3),
                          new Course("AACS2204", "Object-Oriented Programming Techniques", 4)};
    
    SimpleList fruitList = new SimpleList(strArr);
    SimpleList yearList = new SimpleList(yearArr);
    SimpleList courseList = new SimpleList(courseArr);
    
    System.out.println("fruitList: \n" + fruitList);
    System.out.println("\nyearList: \n" + yearList);
    System.out.println("\ncourseList: \n" + courseList);
  }
}
