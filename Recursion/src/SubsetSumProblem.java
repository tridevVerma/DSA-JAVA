public class SubsetSumProblem {
    public static int subsetSum(int[] arr, int sum, int index){
        //  Time Complexity : O(2^n)
        //  Space Complexity : O(
        if(index >= arr.length){
            if(sum == 0) return 1;
            return 0;
        }
        int ans1 = subsetSum(arr, sum-arr[index], index+1);
        int ans2 = subsetSum(arr, sum, index+1);
        return ans1 + ans2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsetSum(arr, 3, 0));
    }
}
