// https://leetcode.com/problems/string-to-integer-atoi/
// medium
// 65, 2042

/**
 * @param {string} s
 * @return {number}
 */
var myAtoi = function (s) {
  const match = s.match(/^ *([+-]?\d+)/);
  if (!match) return 0;
  const num = Number(match[1]);
  return Math.max(Math.min(Math.pow(2, 31) - 1, num), Math.pow(-2, 31));
};