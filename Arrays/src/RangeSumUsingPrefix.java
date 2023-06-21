import java.util.ArrayList;

public class RangeSumUsingPrefix {

    public static ArrayList<Integer> getRangeSum(int[] arr, int n, int[][] queries){
        // Time Complexity : O(q + n)
        // Space Complexity : O(n)

        int[] prefixSumArray = new int[n];
        prefixSumArray[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixSumArray[i] = arr[i] + prefixSumArray[i-1];
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < queries.length; i++){
            if(queries[i][0] == 0){
                ans.add(prefixSumArray[queries[i][1]]);
                continue;
            }
            ans.add(prefixSumArray[queries[i][1]] - prefixSumArray[queries[i][0] - 1]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 5};
        int n = arr.length;
        int qLen = 3;
        int[][] queries = {
                {0, 3},
                {2, 4},
                {1, 3}
        };

        System.out.println(getRangeSum(arr, n, queries));
    }
}
