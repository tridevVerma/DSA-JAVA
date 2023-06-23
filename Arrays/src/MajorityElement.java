public class MajorityElement {
    public static int findMajority(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        // Find Candidate
        int mIndex = 0, count = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[mIndex]) count++;
            else count--;

            if(count == 0){
                mIndex = i;
                count = 1;
            }
        }

        // Check Candidate is Majority or not
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == arr[mIndex]){
                count++;
            }
        }

        if(count > n/2) return arr[mIndex];
        return -1;

    }

    public static void main(String[] args) {
//        int[] arr = {6, 8, 6, 8, 4, 6, 6};
        int[] arr = {6, 8, 4, 8, 8};
        System.out.println(findMajority(arr, arr.length));
    }
}
