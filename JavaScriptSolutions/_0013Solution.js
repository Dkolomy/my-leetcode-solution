// https://leetcode.com/problems/roman-to-integer/
// easy
// 806, 2549, 2869

/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  const dict = new Map();
  dict.set("I", 1)
  dict.set("V", 5)
  dict.set("X", 10)
  dict.set("L", 50)
  dict.set("C", 100)
  dict.set("D", 500)
  dict.set("M", 1000)

  let result = 0;

  for (let i = 0; i < s.length; i++) {
      let curr = dict.get(s[i]);
      result = (curr < dict.get(s[i + 1])) ? result - curr : result + curr;
  }
  return result;

};