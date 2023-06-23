public class MinGroupFlips {
    public static void minFlips(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        for(int i = 1; i < n; i++){
            if(arr[i-1] != arr[i]){
                if(arr[i] != arr[0]){
                    System.out.print("From " + i + " to ");
                }else{
                    System.out.println(i - 1);
                }
            }
        }
        if(arr[n-1] != arr[0]){
            System.out.println(n-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1};
        minFlips(arr, arr.length);
    }
}
