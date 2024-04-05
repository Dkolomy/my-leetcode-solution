// https://leetcode.com/problems/palindrome-number/
// medium
// Time: O(log x); Space: O(1) 

public class _0009Solution {

  public static void main(String[] args) {
    int i1 = 121;
    int i2 = 122;
    int i3 = -111;

    System.out.println(isPalindrome(i1));
    System.out.println(isPalindrome(i2));
    System.out.println(isPalindrome(i3));
  }

  private static boolean isPalindrome(int x) {
    if(x < 0) return false;

    int y = x;
    int flip = 0;
    while(y != 0) {
      flip = flip * 10 + y % 10;
      y /= 10;
    }

    return flip == x;
  }

}
