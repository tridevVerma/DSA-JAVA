import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2){
        //  Time Complexity : O(m+n)
        //  Auxiliary Space : O(m+n)

        int n = arr1.length;
        int m = arr2.length;

        int[] res = new int[m+n];
        int i = 0, j = 0, w = 0;

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                res[w++] = arr1[i++];
            }
            else{
                res[w++] = arr2[j++];
            }
        }

        while(i != n){
            res[w++] = arr1[i++];
        }

        while(j != n){
            res[w++] = arr2[j++];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6};
        int[] arr2 = {2, 5, 7, 8};

        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
