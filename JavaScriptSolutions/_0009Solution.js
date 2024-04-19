// https://leetcode.com/problems/palindrome-number/
// Easy
// 234, 2217, 2396

/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  const isNegative = x < 0 ? true : false;
  if (isNegative) return false;
  let temp = x;
  let reverse = 0;
  while (temp > 0) {
      reverse = (reverse * 10) + (temp % 10)
      temp = parseInt(temp / 10)
  }

  return reverse == x;
};