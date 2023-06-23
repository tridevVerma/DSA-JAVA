public class MaximumDiff {
    public static int maxDiff(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n <= 1) return 0;
        int minElement = arr[0], ans = arr[1] - arr[0];

        for(int i = 1; i < n; i++){
            ans = Math.max(ans, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 10, 8, 1};
        System.out.println(maxDiff(arr, arr.length));
    }
}
