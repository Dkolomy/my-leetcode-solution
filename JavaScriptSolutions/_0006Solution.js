/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function (s, numRows) {
  if (s.length <= numRows || numRows < 2) return s;

  let sLen = s.length
  let block = 2 * (numRows - 1);
  let result = Array(numRows).fill('');
  let temp = 0;

  for (let i = 0; i < sLen; i++) {
      temp = i % block;
      if (temp < numRows) {
          result[temp] += s[i]
      } else {
          result[block - temp] += s[i];
      }
  }

  return result.join('')

};