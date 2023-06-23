public class StockBuySell {
    public static int naiveApproach(int[] arr, int n){
        // Time Complexity = O(n)
        // Space Complexity = O(1)

        if(n <= 1) return 0;

        int profit = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};

        // Get Max Profit
        int ans = naiveApproach(arr, arr.length);
        System.out.println(ans);
    }
}
