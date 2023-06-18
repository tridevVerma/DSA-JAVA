public class OddOccurence {

    public static int efficientApproach(int[] arr, int n){
        //  Time Complexity : theta(n)
        //  Space Complexity : theta(1)

        if(n == 0) return -1;
        int ans = arr[0];
        for(int i = 1; i < n; i++){
            ans ^= arr[i];
        }
        return ans;
    }
    public static int firstApproach(int[] arr, int n){
        //  Time Complexity : theta(n ^ 2)
        //  Space Complexity : theta(1)

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 != 0) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 7, 7, 3, 5, 7};
//        System.out.println(firstApproach(arr, arr.length));
        System.out.println(efficientApproach(arr, arr.length));
    }
}
