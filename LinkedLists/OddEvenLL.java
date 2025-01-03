public class OddEvenLL {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Return the list as-is if it has 0 or 1 node.
        }

        ListNode odd = head; // Odd-indexed nodes.
        ListNode even = head.next; // Even-indexed nodes.
        ListNode evenHead = even; // Head of the even list.

        while (even != null && even.next != null) {
            odd.next = even.next; // Link odd nodes.
            odd = odd.next;

            even.next = odd.next; // Link even nodes.
            even = even.next;
        }

        odd.next = evenHead; // Append the even list after the odd list.
        return head;
    }
}
}
