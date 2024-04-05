// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// easy
// Time: O((m-n)*n); Space: O(1)

public class _0028Solution {

  public static void main(String[] args) {
    String haystack1 = "sadbutsad";
    String needle1 = "sad";
    System.out.println(strStr(haystack1, needle1));

    String haystack2 = "leetcode";
    String needle2 = "leeto";
    System.out.println(strStr(haystack2, needle2));

  }

  private static int strStr(String haystack, String needle) {
    final int m = haystack.length();
    final int n = needle.length();

    for (int i = 0; i < m - n + 1; i++) {
      if(haystack.substring(i, i+n).equals(needle)) return i;
    }

    return -1;
  }
}
