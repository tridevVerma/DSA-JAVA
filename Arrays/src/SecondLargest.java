public class SecondLargest {
    public static int secLargest(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n <= 1) return -1;
        int larIndex = 0;
        int secLarIndex = -1;

        for(int i = 1; i < n; i++){
            if(arr[i] > arr[larIndex]){
                secLarIndex = larIndex;
                larIndex = i;
            }
            else if(arr[i] < arr[larIndex]){
                if(secLarIndex == -1 || arr[i] > arr[secLarIndex]){
                    secLarIndex = i;
                }
            }
        }

        return secLarIndex;
    }
    public static void main(String[] args) {
        int[] arr = {20, 20, 5, 20};
        System.out.println(secLargest(arr, arr.length));
    }
}
