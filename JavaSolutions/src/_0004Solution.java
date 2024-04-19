// https://leetcode.com/problems/median-of-two-sorted-arrays/
// hard
// Time: ; Space: 
// 2387

public class _0004Solution {

  public static void main(String[] args) {

    int[] nums1_1 = { 1, 3 };
    int[] nums2_1 = { 2 };
    // Explanation: merged array = [1,2,3] and median is 2.
    System.out.println(findMedianSortedArrays(nums1_1, nums2_1));

    int[] nums1_2 = { 1, 2 };
    int[] nums2_2 = { 3, 4 };
    // Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
    System.out.println(findMedianSortedArrays(nums1_2, nums2_2));

  }

  private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    final int n1 = nums1.length;
    final int n2 = nums2.length;
    if (n1 > n2)
      return findMedianSortedArrays(nums2, nums1);

    int left = 0;
    int right = n1;

    while (left <= right) {
      final int partition1 = (left + right) / 2;
      final int partition2 = (n1 + n2 + 1) / 2 - partition1;

      final int maxLeft1 = partition1 == 0 ? Integer.MIN_VALUE : nums1[partition1 - 1];
      final int maxLeft2 = partition2 == 0 ? Integer.MIN_VALUE : nums2[partition2 - 1];

      final int minRight1 = partition1 == n1 ? Integer.MAX_VALUE : nums1[partition1];
      final int minRight2 = partition2 == n2 ? Integer.MAX_VALUE : nums2[partition2];

      if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1)
        return (n1 + n2) % 2 == 0 ? (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) * 0.5
            : Math.max(maxLeft1, maxLeft2);
      else if (maxLeft1 > minRight2)
        right = partition1 - 1;
      else
        left = partition1 + 1;
    }
    throw new IllegalArgumentException();
  }

}
