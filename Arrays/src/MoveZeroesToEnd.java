import java.util.Arrays;

public class MoveZeroesToEnd {

    public static int[] zeroesToEnd(int[] arr, int n){
        // Time Complexity : O(n^2)
        // Space Complexity : O(1)

        if(n <= 1) return arr;

        int i = 0;
        while(i < n){
            if(arr[i] == 0){
                int j = i + 1;
                while(j < n && arr[j] == 0){
                    j++;
                }

                if(j == n) return arr;

                arr[i] = arr[j];
                arr[j] = 0;
            }
            i++;
        }

        return arr;
    }

    public static int[] efficientApproach(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n <= 1) return arr;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 10, 0, 20};
//        int[] arr = {0, 0, 0, 10, 0, 0};
//        int[] arr = {10, 20};
        System.out.println(Arrays.toString(efficientApproach(arr, arr.length)));
    }
}
