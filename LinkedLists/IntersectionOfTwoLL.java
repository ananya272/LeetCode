public class IntersectionOfTwoLL {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode tempA = headA;
            ListNode tempB = headB;
            int lengthA =0;
            while(tempA != null){
                lengthA++;
                tempA = tempA.next;
            }
            int lengthB =0;
            while(tempB != null){
                lengthB++;
                tempB = tempB.next;
            }
            tempA = headA;
            tempB = headB;
            if(lengthA > lengthB){
                int steps = lengthA - lengthB;
                for(int i=1; i<=steps; i++){
                    tempA = tempA.next;
                }
            }
                else{
                    int steps = lengthB - lengthA;
                    for(int i=1; i<=steps; i++){
                    tempB = tempB.next;
                }
            }
            while(tempA != tempB){
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempA;
        }
}
}
