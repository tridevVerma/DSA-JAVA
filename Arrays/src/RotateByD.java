import java.util.Arrays;

public class RotateByD {

    public static void rotate(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateByD(int[] arr, int n, int d){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

       if(n <= 1) return;

       rotate(arr, 0, d - 1);
       rotate(arr, d, n-1);
       rotate(arr, 0, n-1);

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 3;
        rotateByD(arr, arr.length, d);
        System.out.println(Arrays.toString(arr));
    }
}
