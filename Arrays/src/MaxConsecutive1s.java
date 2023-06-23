public class MaxConsecutive1s {
    public static int firstApproach(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity: O(1)

        int count = 0, max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
            }else{
                max = Math.max(count, max);
                count = 0;
            }
        }
        max = Math.max(count, max);
        return max;
    }
    public static void main(String[] args) {
//        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1, 1};
        int[] arr = {0, 1, 1, 0, 1, 0};
//        int[] arr = {1, 1, 1, 1};
//        int[] arr = {0, 0, 0};
        int count = firstApproach(arr, arr.length);
        System.out.println(count);
    }
}
