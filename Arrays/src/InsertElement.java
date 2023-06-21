import java.util.Arrays;

public class InsertElement {
    public static boolean insert(int[] arr, int n, int pos, int value){
        // Time Complexity : O(n)

        if(pos >= arr.length || n == arr.length){
            return false;
        }

        int shiftIndex = n - 1;
        while(shiftIndex >= pos){
            arr[shiftIndex + 1] = arr[shiftIndex];
            shiftIndex--;
        }
        arr[pos] = value;
        return true;
    }
    public static void main(String[] args) {
        int capacity = 8, n = 5;
        int[] arr = new int[capacity];
        for(int i = 0; i < n; i++){
            arr[i] = i + 4;
        }
        System.out.println(Arrays.toString(arr));
        insert(arr, n, 3, 12);
        System.out.println(Arrays.toString(arr));
    }
}
