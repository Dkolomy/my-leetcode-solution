/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
  let result = new ListNode(0);
  let ptr = result;

  let carry = 0

  while (l1 || l2) {
      const sum = (l1?.val || 0) + (l2?.val || 0) + carry;
      l1 = l1?.next;
      l2 = l2?.next;

      carry = sum > 9 ? 1 : 0;
      result.next = new ListNode(sum % 10);
      result = result.next;
  }

  if (!!carry) {
      result.next = new ListNode(1);
  }

  return ptr.next;
    
};