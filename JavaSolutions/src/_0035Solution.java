// https://leetcode.com/problems/search-insert-position/
// easy
// Time: O(log n); Space: O(1)

public class _0035Solution {

  public static void main(String[] args) {
    int[] nums1 = { 1, 3, 5, 6 };
    int target1 = 5;
    System.out.println(searchInsert(nums1, target1));

    int[] nums2 = { 1, 3, 5, 6 };
    int target2 = 2;
    System.out.println(searchInsert(nums2, target2));

  }

  private static int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left < right) {
      int m = (left + right) / 2;
      if (nums[m] == target)
        return m;
      if (nums[m] < target)
        left = m + 1;
      else
        right = m;
    }

    return left;
  }
}
