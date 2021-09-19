package examples;

import java.util.*;

public class StringToolkit {
  
  public static String reverse(String inputString) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < inputString.length(); ++i) {
      stack.push(inputString.charAt(i));
    }
    
    StringBuilder reversedString = new StringBuilder();
    while (!stack.empty()) {
      reversedString.append(stack.pop());
    }
    
    return reversedString.toString();
  }
  
}
