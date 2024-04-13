// https://www.youtube.com/watch?v=pEku6cp_J80
// https://leetcode.com/problems/zigzag-conversion/
// medium
// Time: ; Space: 
// 2781, 1234, 678

import java.util.ArrayList;
import java.util.List;

public class _0006Solution {

  public static void main(String[] args) {
    String s1 = "PAYPALISHIRING";
    int numRows1 = 3;
    System.out.println(convert2(s1, numRows1));

    int numRows2 = 4;
    System.out.println(convert2(s1, numRows2));
  }

  public static String convert1(String s, int numRows) {
    // Define StringBuilders
    StringBuilder[] sbs = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
      sbs[i] = new StringBuilder();
    }

    char[] arr = s.toCharArray();
    int n = arr.length;
    int index = 0;

    // TRaverse zig zag
    while (index < n) {
      // Go down
      for (int j = 0; j < numRows && index < n; j++) {
        sbs[j].append(arr[index++]);
      }
      for (int j = numRows - 2; j > 0 && index < n; j--) {
        sbs[j].append(arr[index++]);
      }
    }

    StringBuilder res = sbs[0];
    for (int i = 1; i < numRows; i++) {
      res.append(sbs[i].toString());
    }

    return res.toString();
  }

  public static String convert2(String s, int numRows) {
    StringBuilder sb = new StringBuilder();
    List<Character>[] rows = new List[numRows];
    int k = 0;
    int direction = numRows == 1 ? 0 : -1;

    for (int i = 0; i < numRows; i++)
      rows[i] = new ArrayList<>();

    for (final char c : s.toCharArray()) {
      rows[k].add(c);
      if (k == 0 || k == numRows - 1)
        direction *= -1;
      k += direction;
    }

    for(List<Character> row: rows)
      for(final char c : row)
        sb.append(c);

    return sb.toString();

  }
}
