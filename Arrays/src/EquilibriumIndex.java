public class EquilibriumIndex {
    public static int findIndex(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(n)

        if(n == 0) return -1;
        if(n == 1) return 0;

        int[] prefixSumArray = new int[n];
        prefixSumArray[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixSumArray[i] = arr[i] + prefixSumArray[i-1];
        }

        for(int i = 0; i < n; i++){
            if(i == 0){
                if(prefixSumArray[n-1] - prefixSumArray[0] == 0){
                    return 0;
                }
                continue;
            }
            int left = prefixSumArray[i-1];
            int right = prefixSumArray[n-1] - prefixSumArray[i];
            if(left == right){
                return i;
            }
        }

        return -1;
    }

    public static int optimized(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n == 0) return -1;
        if(n == 1) return 0;

        int leftSum = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        for(int i = 0; i < n; i++){
            sum -= arr[i];
            if(leftSum == sum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

//        int ans = findIndex(arr, arr.length);
        int ans = optimized(arr, arr.length);
        System.out.println(ans);
    }
}
