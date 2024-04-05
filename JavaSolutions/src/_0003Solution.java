// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// 3. Longest Substring Without Repeating Characters 
// medium
// Time: O(n); Space: O(128) - O(1)

public class _0003Solution {

  public static void main(String[] args) {
    String s1 = "abcabcbb";
    String s2 = "bbbbb";
    String s3 = "pwwkew";
    System.out.println(lengthOfLongestSubstring(s1));
    System.out.println(lengthOfLongestSubstring(s2));
    System.out.println(lengthOfLongestSubstring(s3));
  }

  public static int lengthOfLongestSubstring(String s) {
    int result = 0;
    int[] temp = new int[128];

    for (int i = 0, j = 0; i < s.length(); i++) {
      ++temp[s.charAt(i)];
      while (temp[s.charAt(i)] > 1) {
        --temp[s.charAt(j++)];
      }
      result = Math.max(result, i - j + 1);
    }

    return result;
  }

  public static int lengthOfLongestSubstring1(String s) {
    int result = Integer.MIN_VALUE;

    for (int i = 0; i < s.length(); i++) {
      char chHead = s.charAt(i);
      for (int j = i + 1; j < s.length(); j++) {
        if (chHead == s.charAt(j)) {
          result = Math.max(result, (j - i));
          break;
        }
      }
    }

    return result;
  }

}
