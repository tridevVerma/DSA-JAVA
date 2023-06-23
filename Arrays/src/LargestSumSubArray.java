public class LargestSumSubArray {
    public static int maxSubArraySum(int[] arr, int n){
        // Kadane's Algorithm
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(sum + arr[i] > arr[i]){
                sum += arr[i];
            }
            else{
                sum = arr[i];
            }

            max = Math.max(sum, max);
        }

        return max;
    }

    public static void main(String[] args) {
//        int[] arr = {-3, 4, -1, -2, 1, 5};
        int[] arr = {-5, 1, -2, 3, -1, 2, -2};
        int ans = maxSubArraySum(arr, arr.length);
        System.out.println(ans);
    }
}
