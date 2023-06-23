import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] arr, int n){
        // Time Complexity : theta(n)
        // Space Complexity : theta(1)

        if(n <= 1) return arr;

        int low = 0, high = n-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {30, 20, 5};
        System.out.println(Arrays.toString(reverse(arr, arr.length)));
    }
}
