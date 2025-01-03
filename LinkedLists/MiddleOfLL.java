public class MiddleOfLL {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public ListNode middleNode(ListNode head) {
            int size = 1;
            ListNode temp = head;
            while(temp.next != null){
                size++;
                temp = temp.next;
            }
            int mid = size/2;
            for(int i=0; i<mid; i++){
                head = head.next;
            }
            return head;
        }
}
}
