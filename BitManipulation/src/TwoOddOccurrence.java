public class TwoOddOccurrence {
    public static void firstApproach(int[] arr, int n){
        //  Time Complexity : theta(n ^ 2)
        //  Space Complexity : theta(1)

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 != 0) System.out.print(arr[i] + " ");
        }

    }

    public static void efficientApproach(int[] arr, int n){
        //  Time Complexity : theta(n)
        //  Space Complexity : theta(1)

        if(n == 0) return;

        int ans = arr[0];
        for(int i = 1; i < n; i++){
            ans ^= arr[i];
        }

        int k = ans & (-ans);
        int ans1 = ans, ans2 = ans;

        for(int i = 0; i < n; i++){
            if((arr[i] & k) == 1){
                ans1 ^= arr[i];
            }
            else {
                ans2 ^= arr[i];
            }
        }

        System.out.print(ans1 + " " + ans2);
    }

    public static void main(String[] args) {
        int [] arr = {10, 3, 3, 5};
        efficientApproach(arr, arr.length);
    }
}
