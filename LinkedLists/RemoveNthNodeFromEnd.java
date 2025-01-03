public class RemoveNthNodeFromEnd {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode temp = head;

        // Calculate the size of the linked list
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // If removing the first node
        if (n == sz) {
            head = head.next; // Remove the first node
            return head;
        }

        // Find the (sz-n)th node
        int i = 1;
        int iToFind = sz - n;
        ListNode prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;

        return head;
    }
}
