// https://leetcode.com/problems/roman-to-integer/
// easy
// Time: O(n); Space: O(1)

public class _0013Solution {

  public static void main(String[] args) {
    String s1 = "III";
    String s2 = "LVIII";
    String s3 = "MCMXCIV";

    System.out.println(romanToInt(s1));
    System.out.println(romanToInt(s2));
    System.out.println(romanToInt(s3));
  }

  public static int romanToInt(String s) {
    int result = 0;
    int[] roman = new int[128];

    roman['I'] = 1;
    roman['V'] = 5;
    roman['X'] = 10;
    roman['L'] = 50;
    roman['C'] = 100;
    roman['D'] = 500;
    roman['M'] = 1000;

    for (int i = 0; i + 1 < s.length(); i++) {
      if (roman[s.charAt(i)] < roman[s.charAt(i + 1)])
        result -= roman[s.charAt(i)];
      else
        result += roman[s.charAt(i)];
    }

    return result + roman[s.charAt(s.length() - 1)];
  }
}
