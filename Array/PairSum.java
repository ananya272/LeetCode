// You are given an array/list ‘ARR’ consisting of ‘N’ distinct integers arranged in ascending order. You are also given an integer ‘TARGET’. Your task is to count all the distinct pairs in ‘ARR’ such that their sum is equal to ‘TARGET’.

// Note:

// 1. Pair (x,y) and Pair(y,x) are considered as the same pair. 

// 2. If there exists no such pair with sum equals to 'TARGET', then return -1.
// Example:

// Let ‘ARR’ = [1 2 3] and ‘TARGET’ = 4. Then, there exists only one pair in ‘ARR’ with a sum of 4 which is (1, 3). (1, 3) and (3, 1) are counted as only one pair.
// Sample Input 1:
// 2
// 5 6
// 1 2 3 4 5
// 6 7
// 1 2 3 4 5 6
// Sample Output 1:
// 2
// 3
// Explanation for Sample Output 1:
// In test case 1, there exist only 2 pairs whose sum is equal to ‘TARGET’ i.e (1, 5) and (2, 4).

// In test case 2, there are 3 pairs whose sum is equal to ‘TARGET’ which are  (1, 6), (2, 5), and (3, 4).
// Sample Input 2:
// 2
// 4 10
// 1 3 5 6
// 5 12
// 1 3 6 9 11
// Sample Output 2:
// -1
//  2
// Explanation for Sample Output 2:
// In test case 1, there is not a pair whose sum is equal to ‘TARGET’. So we return -1.

// In test case 2, there are 2 pairs whose sum is equal to ‘TARGET’, (1, 11) and (3, 9) respectively.
public class PairSum {
    public static int pairSum(int arr[], int n, int target) {
        int T = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == target){
                    T++;
                }
            }
        }
        if(T==0){
            return -1;
        }
        return T;
    }
}
