// https://leetcode.com/problems/integer-to-roman/
// medium
// Time: O(1); Space: O(1)
// 273

public class _0012Solution {

  public static void main(String[] args) {
    int num1 = 3;
    int num2 = 58;
    int num3 = 1994;

    System.out.println(intToRoman(num1));
    System.out.println(intToRoman(num2));
    System.out.println(intToRoman(num3));

  }

  private static String intToRoman1(int num) {
    final String[] M = { "", "M", "MM", "MMM" };
    final String[] C = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
    final String[] X = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
    final String[] I = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

    return M[num / 1000] + C[num % 1000 / 100] + X[num % 100 / 10] + I[num % 10];
  }

  private static String intToRoman(int num) {
    final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    final String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < values.length; ++i) {
      if(num == 0) break;
      while (num >= values[i]) {
        num -= values[i];
        sb.append(symbols[i]);
      }
    }

    return sb.toString();
  }
}
