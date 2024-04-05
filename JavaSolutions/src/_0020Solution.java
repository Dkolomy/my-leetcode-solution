import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/valid-parentheses/
// easy
// Time: O(n) ; Space: O(n)

public class _0020Solution {
  public static void main(String[] args) {
    String s1 = "()";
    String s2 = "()[]{}";
    String s3 = "([";

    System.out.println(isValid(s1));
    System.out.println(isValid(s2));
    System.out.println(isValid(s3));

  }

  public static boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for (final char c : s.toCharArray()) {
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }

    return stack.isEmpty();
  }
}
