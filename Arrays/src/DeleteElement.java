import java.util.Arrays;

public class DeleteElement {
    public static boolean delete (int[] arr, int n, int x){
        // Time Complexity : O(n)

        if(n <= 0 || arr.length == 0) return false;

        int pos = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                pos = i;
                break;
            }
        }
        if(pos == -1) return false;
        while(pos < n){
            arr[pos] = arr[pos+1];
            pos++;
        }
        return true;
    }
    public static void main(String[] args) {
        int capacity = 8, n = 5;
        int[] arr = new int[capacity];
        for(int i = 0; i < n; i++){
            arr[i] = (i * 4) + 2;
        }
        System.out.println(Arrays.toString(arr));
        delete(arr, n, 14);
        System.out.println(Arrays.toString(arr));
        delete(arr, 4, 12);
        System.out.println(Arrays.toString(arr));
    }
}
