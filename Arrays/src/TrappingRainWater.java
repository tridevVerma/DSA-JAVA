public class TrappingRainWater {
    public static int storedWater(int[] arr, int n){
        // Time Complexity : O(n^2)
        // Space Complexity : O(1)

        if(n <= 2){
            return 0;
        }

        int totalTrappedWater = 0;

        for(int i = 1; i < n-1; i++){
            int lmax = arr[i];
            for(int j = 0; j < i; j++){
                lmax = Math.max(arr[j], lmax);
            }

            int rmax = arr[i];
            for(int j = i+1; j < n; j++){
                rmax = Math.max(arr[j], rmax);
            }

            totalTrappedWater += Math.min(lmax, rmax) - arr[i];
        }

        return totalTrappedWater;
    }

    public static int efficientStoredWater(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(n)

        if(n <= 2){
            return 0;
        }

        int[] lmax = new int[n];
        lmax[0] = arr[0];
        for(int i = 1; i < n; i++){
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }

        int[] rmax = new int[n];
        rmax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }

        int ans = 0;
        for(int i = 1; i < n-1; i++){
            ans += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = {3, 0, 1, 2, 5};
        int[] arr = {1, 0, 0, 3, 0, 1, 2, 4};
//        int volume = storedWater(arr, arr.length);
        int volume = efficientStoredWater(arr, arr.length);
        System.out.println(volume);
    }
}
