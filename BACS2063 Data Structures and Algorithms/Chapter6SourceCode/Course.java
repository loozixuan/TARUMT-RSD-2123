package samplecode;

/**
 * Course.java An entity class to represent a University course
 * @author Kat Tan
 */
public class Course {
  private String code;
  private String title;
  private int hours;

  public Course(String code, String title, int hours) {
    this.code = code;
    this.title = title;
    this.hours = hours;
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

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
    return code + " " + title + ", " + hours + "  credit hours";
  }

}
