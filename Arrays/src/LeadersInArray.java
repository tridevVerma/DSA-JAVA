import java.util.ArrayList;

public class LeadersInArray {
    public static ArrayList<Integer> getLeaders(int[] arr, int n){
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        if(n == 0) return new ArrayList<>();

        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > max){
                res.add(arr[i]);
                max = arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        ArrayList<Integer> leaders = getLeaders(arr, arr.length);
        System.out.println(leaders);
    }
}
