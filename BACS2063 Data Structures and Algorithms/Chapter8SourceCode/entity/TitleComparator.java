package entity;

import entity.Course;
import java.util.Comparator;

/**
 *
 * @author Kat Tan
 */
public class TitleComparator implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    Course c1 = (Course)o1;
    Course c2 = (Course)o2;
    
    return c1.getTitle().compareTo(c2.getTitle());
  }
  
}
