public class LargestSubArrayCircularSum {

    public static int findLargestSum(int[] arr, int n){
        int sum = 0, max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] + sum > arr[i]){
                sum += arr[i];
            }else{
                sum = arr[i];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static int findSmallestSum(int[] arr, int n){
        int sum = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] + sum < arr[i]){
                sum += arr[i];
            }else{
                sum = arr[i];
            }

            min = Math.min(sum, min);
        }

        return min;
    }
    public static int largestSum(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        int largestSumInNormalArray = findLargestSum(arr, n);

        if(largestSumInNormalArray < 0) return largestSumInNormalArray;

        int totalSum = 0;
        for(int i = 0; i < n; i++){
            totalSum += arr[i];
        }

        int largestSumInCircularArray = totalSum - findSmallestSum(arr, n);

        return Math.max(largestSumInNormalArray, largestSumInCircularArray);
    }
    public static void main(String[] args) {
//        int[] arr = {5, -2, 3, 4};
//        int[] arr = {8, -4, 3, -5, 4};
//        int[] arr = {-8, 7, 6};
        int[] arr = {-5, -3};
        System.out.println(largestSum(arr, arr.length));
    }
}
