// https://leetcode.com/problems/container-with-most-water/
// medium
// Time: O(1); Space: O(1)
// 42, 2517, 2560

public class _0011Solution {

  public static void main(String[] args) {
    int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxArea(height1));
    
   int[] height2 = { 1, 1 };
   System.out.println(maxArea(height2));

    int[] height3 = { 4, 3, 2, 1, 4 };
    System.out.println(maxArea(height3));

  }

  private static int maxArea(int[] height) {
    int result = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      int area = (right - left) * Math.min(height[left], height[right]);
      result = Math.max(result, area);
      if (height[left] < height[right])
        ++left;
      else
        --right;
    }

    return result;

  }
}
