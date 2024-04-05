// https://leetcode.com/problems/longest-palindromic-substring/
// medium
// https://www.youtube.com/watch?v=y2BD4MJqV20
// Time: O(n^2); Space: O(1)
// 214, 226, 336

public class _0004Solution {

  public static void main(String[] args) {
    String s1 = "babad"; // bab
    String s2 = "cbbd"; // bb
    System.out.println(longestPalindrome(s1));
    System.out.println(longestPalindrome(s2));
  }

  public static String longestPalindrome(String s) {
    if (s.isEmpty()) return "";

    int start = 0;
    int end = 0;
    for(int i=0; i<s.length(); i++) {
      int len1 = expandFromMiddle(s, i, i);
      int len2 = expandFromMiddle(s, i, i+1);
      int len = Math.max(len1, len2);
      if(len > end - start) {
        start = i - ((len-1)/2);
        end = i + len / 2;
      }
    }

    return s.substring(start, end + 1);
  }

  public static int expandFromMiddle(String s, int left, int right) {
    if(s == null || left > right) return 0;
    while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return right - left - 1;
  }

}
