public class MergeTwoSortedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // Create a dummy node to simplify edge cases
            ListNode temp = new ListNode(-1);
            ListNode current = temp;
    
            // Traverse both lists and merge nodes in sorted order
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
    
            // Attach remaining nodes from either list, if any
            if (list1 != null) {
                current.next = list1;
            } else if (list2 != null) {
                current.next = list2;
            }
    
            // Return the merged list starting from the first real node
            return temp.next;
        }
     }
}
