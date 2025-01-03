public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m - 1; // Start from the top-right corner

        while (i < n && j >= 0) { // Stay within matrix bounds
            if (matrix[i][j] == target) {
                System.out.println("Found at (" + i + "," + j + ")");
                return true;
            }
            // Move down if the target is greater
            else if (matrix[i][j] < target) {
                i++;
            }
            // Move left if the target is smaller
            else {
                j--;
            }
        }

        // System.out.println("NOT Found");
        return false;
    }
}