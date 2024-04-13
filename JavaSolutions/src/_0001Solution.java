// https://leetcode.com/problems/two-sum/
// 1. Two Sum
// Time: O(n); Space: O(n)
// Easy

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _0001Solution {

  public static void main(String[] args) {
    int[] nums1 = { 2, 7, 11, 15 };
    int target1 = 9;
    System.out.println(Arrays.toString(twoSum(nums1, target1)));

    int[] nums3 = { 3, 2, 4 };
    int target3 = 6;
    System.out.println(Arrays.toString(twoSum(nums3, target3)));

    int[] nums2 = { 3, 3 };
    int target2 = 6;
    System.out.println(Arrays.toString(twoSum(nums2, target2)));
  }

  private static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int res = target - nums[i];
      if (numToIndex.containsKey(res)) {
        return new int[] { numToIndex.get(res), i };
      }
      numToIndex.put(nums[i], i);
    }
    
    throw new IllegalArgumentException();
  }
}
