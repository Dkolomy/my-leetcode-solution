/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function (s) {
  let totalLen = s.length;
  if (s == null || totalLen < 1) return "";

  let maxLength = 0;
  let left = 0;
  let right = 0;

  const getPalindrome = (leftPos, rightPos) => {
    while (leftPos >= 0 && rightPos < totalLen && s[leftPos] === s[rightPos]) {
      leftPos--;
      rightPos++;
    }

    if (rightPos - leftPos > maxLength) {
      left = leftPos + 1;
      right = rightPos - 1;
      maxLength = right - left + 1;
    }
  };

  for (let i = 0; i < totalLen; i++) {
    getPalindrome(i, i + 1);
    getPalindrome(i, i);

    if ((totalLen - i) * 2 < maxLength) {
      break;
    }
  }

  return s.slice(left, right + 1);
};
