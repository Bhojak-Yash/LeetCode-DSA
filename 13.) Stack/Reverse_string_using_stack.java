import java.util.*;

public class Reverse_string_using_stack {

  public static String revrseString(String str) {
    Stack<Character> s = new Stack<>();
    int i = 0;
    while (i < str.length()) {
      s.push(str.charAt(i));
      i++;
    }

    StringBuilder result = new StringBuilder("");
    while (!s.isEmpty()) {
      result.append(s.pop());
    }

    return result.toString();
  }

  public static void main(String[] args) {
    String str = "NAVNEET";
    System.out.println(revrseString(str));
  }
}