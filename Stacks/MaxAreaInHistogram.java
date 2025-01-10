import java.util.Stack;

public class MaxAreaInHistogram{
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) return 0;

        int[] nls = new int[n]; // Next Left Smallest
        int[] nrs = new int[n]; // Next Right Smallest
        Stack<Integer> stack = new Stack<>();

        // Next Right Smallest
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nrs[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Next Left Smallest
        stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nls[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Calculate the maximum rectangle area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nrs[i] - nls[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}