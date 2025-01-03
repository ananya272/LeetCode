public class Subrarray {
    public static void subarr(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = 1+1; j < n; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.println(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        subarr(arr);
    }
}
