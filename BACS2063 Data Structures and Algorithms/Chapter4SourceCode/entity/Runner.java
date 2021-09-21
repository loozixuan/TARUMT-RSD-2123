package entity;

import java.io.Serializable;

/**
 * Runner.java An entity class that represents a registered runner in a marathon.
 * @author Kat Tan
 * @version 1.0
 */
public class Runner implements Serializable {
  private static int nextNumber = 1000;
  private String name;
  private int number;
  private int finishPosition;

  public Runner(int number) {
    this.number = number;
  }
  
  public Runner(String name) {
    this.name = name;
    this.number = nextNumber++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public static int getNextNumber() {
    return nextNumber;
  }

  public static void setNextNumber(int nextNumber) {
    Runner.nextNumber = nextNumber;
  }

  public int getFinishPosition() {
    return finishPosition;
  }

  public void setFinishPosition(int finishPosition) {
    this.finishPosition = finishPosition;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Runner other = (Runner) obj;
    if (this.number != other.number) {
      return false;
    }
    return true;
  }
  
  
      
  @Override
  public String toString() {
    return String.format("No. %-10d %-20s\n", number, name);
  }
  
  
}
