public class MyClass {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(10);
    ListNode node2 = new ListNode(20);
    ListNode node3 = new ListNode(30);

    node1.next = node2;
    node2.next = node3;

    ListNode current = node1;
    while (current != null) {
      System.out.println(current.val);
      current = current.next;
    }

  }

}
