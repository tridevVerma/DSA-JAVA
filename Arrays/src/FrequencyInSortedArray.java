public class FrequencyInSortedArray {
    public static void printFrequencies(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n == 0) return;
        if(n == 1) {
            System.out.println(arr[0] + " " + 1);
            return;
        }

        int count = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                System.out.println(arr[i-1] + " " + count);
                count = 1;
            }
        }
        System.out.println(arr[n-1] + " " + count);
    }

    public static void main(String[] args) {
//        int[] arr = {10, 10, 10, 20, 30, 30};
//        int[] arr = {10, 10, 10, 10};
        int[] arr = {10, 20, 30};
        printFrequencies(arr, arr.length);
    }
}
