import java.util.Arrays;

public class RotateBy1 {
    public static void rotate(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n <= 1) return;

        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
