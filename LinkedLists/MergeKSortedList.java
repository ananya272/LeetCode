public class MergeKSortedList {
    class Node {
        int data;
        Node next;
        Node() {}
        Node(int data) { this.data = data; }
        Node(int data, Node next) { this.data = data; this.next = next; }

    public static Node SortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.data <= b.data) {
            result = a;
            result.next = SortedMerge(a.next, b);
        } else {
            result = b;
            result.next = SortedMerge(a, b.next);
        }
        return result;
    }

    // Method to merge K sorted linked lists
    public static Node mergeKLists(Node arr[], int last) {
        while (last != 0) {
            int i = 0, j = last;

            while (i < j) {
                // Merge two lists and store the result in arr[i]
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                j--;

                // Update the last index if all pairs are merged
                if (i >= j) {
                    last = j;
                }
            }
        }
        return arr[0];
}
    }
}
