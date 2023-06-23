public class MaxEvenOddSubArray {
    private static int maxLen(int[] arr, int n) {
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n <= 1) return n;

        int max = 0, count = 1;
        for(int i = 1; i < n; i++){
            if(((arr[i] & 1) ^ (arr[i-1] & 1)) == 1){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
    public static void main(String[] args) {
//        int[] arr = {10, 12, 14, 7, 8};
//        int[] arr = {7, 10, 13, 14};
        int[] arr = {10, 12, 8, 4};
        System.out.println(maxLen(arr, arr.length));
    }


}
