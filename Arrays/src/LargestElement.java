public class LargestElement {
    public static int findLargest(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n == 0) return -1;

        int max = arr[0];
        int index = 0;

        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 8 , 20, 10};
        System.out.println(findLargest(arr, arr.length));
    }
}
