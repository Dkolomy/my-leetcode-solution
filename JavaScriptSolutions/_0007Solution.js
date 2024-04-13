// https://leetcode.com/problems/reverse-integer/
// medium
// 2119, 2442

/**
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
  let result = 0;

  let idx = x < 0;
  x = Math.abs(x);
  while (x > 0) {
      result = result * 10 + x % 10;
      x = Math.floor(x / 10);
  }

  return result > 0x7FFFFFFF ? 0 : idx ? -result : result;
};
