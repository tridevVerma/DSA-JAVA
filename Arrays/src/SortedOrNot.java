public class SortedOrNot {
    public static boolean checkSorted(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n <= 1) return true;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {8, 10, 10, 9};
        System.out.println(checkSorted(arr, arr.length));
    }
}
