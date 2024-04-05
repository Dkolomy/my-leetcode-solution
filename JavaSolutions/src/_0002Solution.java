// https://leetcode.com/problems/add-two-numbers/
// 2. Add Two Numbers 
// Time: O(n) ; Space: O(1) 
// medium
public class _0002Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    int carry = 0;

    while (l1 != null || l2 != null || carry > 0) {
      if (l1 != null) {
        carry += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        carry += l2.val;
        l2 = l2.next;
      }
      current.next = new ListNode(carry % 10);
      carry /= 10;
      current = current.next;
    }

    return dummy.next;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  };

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}