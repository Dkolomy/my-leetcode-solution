// https://leetcode.com/problems/integer-to-roman/
// medium
// 273

/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function (num) {
  const dict = [
      ["I", 1],
      ["IV", 4],
      ["V", 5],
      ["IX", 9],
      ["X", 10],
      ["XL", 40],
      ["L", 50],
      ["XC", 90],
      ["C", 100],
      ["CD", 400],
      ["D", 500],
      ["CM", 900],
      ["M", 1000],
  ];

  let results = "";

  for (let i = dict.length - 1; i > -1; i--) {
      let temp = Math.floor(num / dict[i][1]);
      if (temp) {
          results += dict[i][0].repeat(temp);
          num = num % dict[i][1];
      }
  }

  return results;

};

