// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how 
// much water it can trap after raining.

// Example 1:
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 
// 6 units of rain water (blue section) are being trapped.

// Example 2:
// Input: height = [4,2,0,3,2,5]
// Output: 9
public class TrappingRainWater {
    public int trap(int[] height){
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        int total = 0;
        int n = height.length;
        int rightarr[] = new int[n];
        int leftarr[] = new int[n];
        int waterlevel = height[0];

        for (int i = 0; i < n; i++) {
            left = Math.max(left,height[i]);
            leftarr[i] = left;
        }
        for (int i = n-1; i >=0 ; i--) {
            right = Math.max(right,height[i]);
            rightarr[i] = right;
        }
        for (int i = 0; i < n; i++) {
            waterlevel = Math.min(leftarr[i], rightarr[i]);
            total += waterlevel-height[i];
        }
        return total;
    }
    public static void main(String[] args) {
        TrappingRainWater trap = new TrappingRainWater();
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {4, 2, 0, 3, 2, 5};

        System.out.println("Trapped water for height1: " + trap.trap(height1));
        System.out.println("Trapped water for height2: " + trap.trap(height2));
    }
}
