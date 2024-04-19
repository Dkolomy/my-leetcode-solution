// https://leetcode.com/problems/longest-common-prefix/
// easy
// 2996, 3043, 3093

/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function (strs) {
  if (!strs.length) return "";
  for (let i = 0; i < strs[0].length; i++) {
      if (!strs.every((pref) => pref[i] === strs[0][i])) {
          return strs[0].slice(0, i);
      }
  }
  return strs[0];
};