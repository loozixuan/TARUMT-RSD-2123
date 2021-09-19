package examples;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kat Tan
 */
public class ShoppingListApp {

  private ArrayList<String> shoppingList = new ArrayList<>();
  private Scanner scanner = new Scanner(System.in);

  public void display() {
    System.out.println("\nShopping List");
    for (int i = 0; i < shoppingList.size(); i++) {
      System.out.printf("%3d. %s\n", (i + 1), shoppingList.get(i));
    }
  }

  public void addItem() {
    display();
    System.out.print("\nEnter new item to add: ");
    String newItem = scanner.nextLine();
    shoppingList.add(newItem);
  }

  public void removeItem() {
    display();
    System.out.print("\nEnter the line number of the item to be removed: ");
    int lineNumber = scanner.nextInt();
    scanner.nextLine();
    shoppingList.remove(lineNumber - 1);
  }

  public void menu() {
    int choice = 0;
    do {
      System.out.println("\nREALLY SIMPLE SHOPPING LIST APP");
      System.out.println("1. Add a new item to the shopping list");
      System.out.println("2. Remove an item from the shopping list");
      System.out.println("3. Display all items in the shopping list");
      System.out.println("4. Exit the program");
      System.out.print("Enter choice (1..4): ");
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          addItem();
          break;
        case 2:
          removeItem();
          break;
        case 3:
          display();
          break;
        default:
          System.out.println("\nExiting program.");
      }
    } while (choice >= 1 && choice <= 3);
  }
  
  public static void main(String[] args) {
    ShoppingListApp s = new ShoppingListApp();
    s.menu();
  }
}
