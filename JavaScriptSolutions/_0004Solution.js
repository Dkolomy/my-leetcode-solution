/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (nums1, nums2) {
  let ptr1 = 0;
  let ptr2 = 0;

  const len1 = nums1.length;
  const len2 = nums2.length;
  const len = len1 + len2;

  if (len === 0) {
      return null;
  }

  const sortedArr = [];

  while (ptr1 < len1 && ptr2 < len2) {
      if (nums1[ptr1] <= nums2[ptr2]) {
          sortedArr.push(nums1[ptr1++]);
      } else {
          sortedArr.push(nums2[ptr2++]);
      }
  }

  while (ptr1 < len1) {
      sortedArr.push(nums1[ptr1++]);
  }
  while (ptr2 < len2) {
      sortedArr.push(nums2[ptr2++]);
  }

  const isOdd = len % 2;
  if (isOdd) {
      return sortedArr[(len - 1) / 2];
  } else {
      return (sortedArr[len / 2] + sortedArr[len / 2 - 1]) / 2;
  }
};