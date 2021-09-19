package adt;

import entity.Name;

/**
 * A driver that demonstrates the class SortedArrayList.
 */
public class Driver {

  public static void main(String[] args) {
    new Driver().testSortedList();
    System.out.println("\nDone.");
  }

  public void testSortedList() {
    // create names for a list
    Name brent = new Name("Brent", "Barka");
    Name donna = new Name("Donna", "Dalton");
    Name jerry = new Name("Jerry", "Java");
    Name luke = new Name("Luke", "Lexter");
    Name sue = new Name("Sue", "Smith");
    Name tom = new Name("Tom", "Towers");

    // create a list
    SortedListInterface<Name> myList = new SortedArrayList<Name>();

    myList.add(luke);
    myList.add(brent);
    myList.add(donna);
    myList.add(tom);
    myList.add(sue);
    myList.add(jerry);

    System.out.println("List should contain\nBrent Barka, Donna Dalton, "
            + "Jerry Java, Luke Lexter, Sue Smith, Tom Towers");
    System.out.println("\nList actually contains:\n" + myList);
    System.out.println("\nTest getLength and getEntry:\n");

    System.out.println("\nList has " + myList.getNumberOfEntries() + " entries\n");

    // test contains
    System.out.println("\nTesting method contains:\n");

    if (myList.contains(brent)) {
      System.out.println("\nBrent is in list - OK");
    } else {
      System.out.println("contains() error");
    }

    if (myList.contains(donna)) {
      System.out.println("\nDonna is in list - OK");
    } else {
      System.out.println("contains() error");
    }

    if (myList.contains(jerry)) {
      System.out.println("\nJerry is in list - OK");
    } else {
      System.out.println("contains() error");
    }

    if (myList.contains(luke)) {
      System.out.println("\nLuke is in list - OK");
    } else {
      System.out.println("contains() error");
    }

    if (myList.contains(sue)) {
      System.out.println("\nSue is in list - OK");
    } else {
      System.out.println("contains() error");
    }

    if (myList.contains(tom)) {
      System.out.println("\nTom is in list - OK");
    } else {
      System.out.println("contains() error");
    }

    Name missy = new Name("Missy", "Gold");
    if (!myList.contains(missy)) {
      System.out.println("\nMissing Person is not in list - OK");
    } else {
      System.out.println("contains() error");
    }

    // test contains and isEmpty on an empty list
    System.out.println("\nTest contains with an empty list:");

    SortedListInterface emptyList = new SortedArrayList();
    if (emptyList.contains(luke)) {
      System.out.println("contains() error");
    } else {
      System.out.println("Luke is not in an empty list - OK");
    }

    System.out.println("\nTest isEmpty with an empty list:");
    if (emptyList.isEmpty()) {
      System.out.println("OK");
    } else {
      System.out.println("isEmpty() error");
    }

    // test clear()
    System.out.println("\nTest clear():");
    myList.clear();

    if (myList.isEmpty()) {
      System.out.println("\nThe list is empty after invoking clear().");
    } else {
      System.out.println("\nclear() error");
    }
  }
}
