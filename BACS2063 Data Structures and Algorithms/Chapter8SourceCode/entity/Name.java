package entity;

/**
 * A mutable class that represents a person's name. 
 * 
 */
public class Name implements Comparable<Name> {

  private String first; // first name
  private String last;  // last name

  public Name() {
    first = "";
    last = "";
  } 

  public Name(String firstName, String lastName) {
    first = firstName;
    last = lastName;
  } 

  public void setName(String firstName, String lastName) {
    setFirst(firstName);
    setLast(lastName);
  } 

  public String getName() {
    return toString();
  } 

  public void setFirst(String firstName) {
    first = firstName;
  } 

  public String getFirst() {
    return first;
  } 

  public void setLast(String lastName) {
    last = lastName;
  } 

  public String getLast() {
    return last;
  } 

  public void giveLastNameTo(Name aName) {
    aName.setLast(last);
  } 

  public String toString() {
    return first + " " + last;
  } 

  public boolean equals(Object other) {
    boolean result;

    if ((other == null) || (getClass() != other.getClass())) {
      result = false;
    } else {
      Name otherName = (Name) other;
      result = first.equals(otherName.first)
              && last.equals(otherName.last);
    } 

    return result;
  } 

  public int compareTo(Name otherName) {
    int result = last.compareTo(otherName.last);

    if (result == 0) {
      result = first.compareTo(otherName.first);
    }

    return result;
  } 
} 
