public class LargestSumSubArray {
    public static int findLargestSum(int[] arr, int n, int index, int sum){
        // Kadane's Algorithm
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(index == n) return 0;

        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] + currentSum > arr[i]){
                currentSum += arr[i];
            }
            else{
                currentSum = arr[i];
            }

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 4, -1, -2, 1, 5};
        int ans = findLargestSum(arr, arr.length, 0, 0);
        System.out.println(ans);
    }
}
