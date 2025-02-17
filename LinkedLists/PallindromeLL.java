public class PallindromeLL {
    class ListNode {
           int val;
           ListNode next;
           ListNode() {}
           ListNode(int val) { this.val = val; }
           ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode findMid(ListNode head) { // helper
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midNode
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // step1 - find mid
        ListNode midNode = findMid(head);

        // step2 - reverse 2nd half
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode right = prev; // right half head
        ListNode left = head;  // left half head

        // step3 - check left half & right half
        while (right != null) {
            if (left.val != right.val) { 
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
