// https://leetcode.com/problems/two-sum/
// 1. Two Sum
// Time: O(n); Space: O(n)
// Easy

import java.util.HashMap;
import java.util.Map;

public class _0001Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int res = target - nums[i];
      if (numToIndex.containsKey(res))
        return new int[] { numToIndex.get(res), i };
      numToIndex.put(nums[i], i);
    }

    throw new IllegalArgumentException();
  }
}
