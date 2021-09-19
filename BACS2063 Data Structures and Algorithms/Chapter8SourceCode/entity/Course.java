package entity;
/**
 *
 * @author Kat Tan
 */

public class Course implements Comparable<Course>{
  private String code;
  private String title;
  private int creditHours;

  public Course(String code, String title, int creditHours) {
    this.code = code;
    this.title = title;
    this.creditHours = creditHours;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getCreditHours() {
    return creditHours;
  }

  public void setCreditHours(int creditHours) {
    this.creditHours = creditHours;
  }

  @Override
  public int compareTo(Course o) {
    return code.compareTo(o.code);
  }

  @Override
  public String toString() {
    return String.format("%-10s %-40s %-10d", code, title, creditHours);
  }
  
  
 
}
