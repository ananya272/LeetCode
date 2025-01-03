public class LargestElement {
    
        final static int N = 4;
        final static int  M = 4 ;
     
        // Function to find max element
        // mat[][] : 2D array to find max element
        static int findMax(int mat[][])
        {
     // yefunction bharoooo
     int max = Integer.MIN_VALUE;
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                
            
            if(max < mat[i][j]) {
                max = mat[i][j];
            }
        }
        }
        return max;
        }
     
         
        // Driver code
        public static void main(String args[])
        {
               // matrix
            int mat[][] = { { 1, 2, 3, 4 },
                              { 25, 6, 7, 8 },
                              { 9, 10, 11, 12 },
                              { 13, 14, 15, 16 } };
     
            System.out.println(findMax(mat)) ;
       
        }
        
    }

