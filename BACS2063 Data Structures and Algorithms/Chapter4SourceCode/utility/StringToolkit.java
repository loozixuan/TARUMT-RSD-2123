package utility;

import adt.ArrayStack;
import adt.StackInterface;

public class StringToolkit {
  
  public static String reverse(String inputString) {
    StackInterface<Character> stack = new ArrayStack<>();
    for (int i = 0; i < inputString.length(); ++i) {
      stack.push(inputString.charAt(i));
    }
    
    StringBuilder reversedString = new StringBuilder();
    while (!stack.isEmpty()) {
      reversedString.append(stack.pop());
    }
    
    return reversedString.toString();
  }
  
}
