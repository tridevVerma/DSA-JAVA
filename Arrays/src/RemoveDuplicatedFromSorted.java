import java.util.Arrays;

public class RemoveDuplicatedFromSorted {
    public static int removeDuplicates(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n <= 1) return n;

        int size = 1;

        for(int i = 1; i < n; i++){
           if(arr[i] != arr[size-1]){
               arr[size] = arr[i];
               size++;
           }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 30, 40, 50, 50, 60};
//        int[] arr = {10, 10, 10, 10};
        int size = removeDuplicates(arr, arr.length);
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
}
