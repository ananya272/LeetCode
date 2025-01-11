import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0]; // Handle edge cases
        }

        int n = nums.length;
        int[] result = new int[n - k + 1]; // Array to store the result
        Deque<Integer> q = new ArrayDeque<>(); // Deque to store indices

        // Process the first 'k' elements
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && nums[q.getLast()] < nums[i]) {
                q.removeLast();
            }
            q.addLast(i);
        }

        // Store the maximum of the first window
        result[0] = nums[q.getFirst()];

        // Process the rest of the array
        for (int i = k; i < n; i++) {
            result[i - k] = nums[q.getFirst()]; // Store the max of the previous window

            // Remove indices that are out of the current window
            while (!q.isEmpty() && q.getFirst() <= i - k) {
                q.removeFirst();
            }

            // Remove indices of elements smaller than the current element
            while (!q.isEmpty() && nums[q.getLast()] < nums[i]) {
                q.removeLast();
            }

            q.addLast(i); // Add the current element index to the deque
        }

        // Store the maximum of the last window
        result[n - k] = nums[q.getFirst()];

        return result; // Return the result array
    }
}
