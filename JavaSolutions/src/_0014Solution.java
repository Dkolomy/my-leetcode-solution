// https://leetcode.com/problems/longest-common-prefix/
// easy
// Time: ; Space: 

public class _0014Solution {

  public static void main(String[] args) {
    String[] strs1 = {"flower", "flow", "flight"};
    String[] strs2 = {"dog", "racecar", "car"};

    System.out.println(longestCommonPrefix(strs1));
    System.out.println(longestCommonPrefix(strs2));

  }

  public static String longestCommonPrefix(String[] strs) {
    if(strs.length == 0) return "";

    for (int i = 0; i < strs[0].length(); i++) {
      for (int j = 1; j < strs.length; j++) {
        if(i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
          return strs[0].substring(0,i);
        }
      }
    }

    return strs[0];
  }

}
