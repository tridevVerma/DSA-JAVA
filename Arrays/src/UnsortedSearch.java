public class UnsortedSearch {
    public static int search(int[] arr, int x){
        // Time Complexity : O(n)

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,18, 4, 3, 6};
        System.out.println(search(arr, 30));
    }
}
