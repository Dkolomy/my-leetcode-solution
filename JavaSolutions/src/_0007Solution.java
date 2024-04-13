// https://leetcode.com/problems/reverse-integer/
// medium
// Time: O(log x); Space: O(1)
// 2119, 2442

public class _0007Solution {

  public static void main(String[] args) {
    int i1 = 123;
    int i2 = -123;
    int i3 = 120;

    System.out.println(reverse(i1));
    System.out.println(reverse(i2));
    System.out.println(reverse(i3));

  }

  public static int reverse(int x) {
    long result = 0;

    while(x != 0) {
      result = result * 10 + x % 10;
      x /= 10;
    }

    return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) ? 0 : (int) result;
  }
}
