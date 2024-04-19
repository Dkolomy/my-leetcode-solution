// https://leetcode.com/problems/string-to-integer-atoi/
// medium
// Time: 0(n) Space: O(1)
// 65, 2042

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _0008Solution {
  public static void main(String[] args) {
    System.out.println(myAtoi("   -42ddd"));
  }

  public static int myAtoi1(String s) {
    Pattern pattern = Pattern.compile("^*([+-]?\\d+)");
    Matcher matcher = pattern.matcher(s);
    if(matcher.find()) {
      return Integer.valueOf(matcher.group(0));
    }
    return 0;
  }

  public static int myAtoi(String s) {
    s = s.strip();
    if(s.isEmpty()) return 0;

    final int sign = s.charAt(0) == '-' ? -1 : 1;
    if (s.charAt(0) == '+' || s.charAt(0) == '-') {
      System.out.println("In");
      s = s.substring(1);

    }

    System.out.println("ddd:["+s+"]"+sign);

    long num = 0;
    for (final char c : s.toCharArray()) {
      if(!Character.isDigit(c)) break;
      num = num * 10 + (c - '0');
      if (sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
      if (sign * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
    }

    return sign * (int) num;
  }

}
