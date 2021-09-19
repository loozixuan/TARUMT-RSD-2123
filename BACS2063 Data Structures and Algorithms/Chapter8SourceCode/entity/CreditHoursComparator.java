package entity;

import entity.Course;
import java.util.Comparator;

/**
 *
 * @author Kat Tan
 */
public class CreditHoursComparator implements Comparator{

  @Override
  public int compare(Object o1, Object o2) {
    Course c1 = (Course)o1;
    Course c2 = (Course)o2;
    
    if (c1.getCreditHours() == c2.getCreditHours())
      return 0;
    else if (c1.getCreditHours() > c2.getCreditHours())
      return 1;
    else
      return -1;
   
  }
  
}
