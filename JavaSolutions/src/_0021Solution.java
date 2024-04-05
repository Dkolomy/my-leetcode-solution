// https://leetcode.com/problems/merge-two-sorted-lists/
// easy
// Time: 0(|list1|+|list2|) ; Space: O(1) 

public class _0021Solution {

  public static void main(String[] args) {
    
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1 == null || list2 == null) {
      return list1 == null ? list2 : list1;
    }
    if(list1.val > list2.val) {
      ListNode temp = list1;
      list1 = list2;
      list2 = temp;
    }
    list1.next = mergeTwoLists(list1.next, list2);
    return list1;
  }
}
