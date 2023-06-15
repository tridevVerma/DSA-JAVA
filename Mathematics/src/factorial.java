public class factorial {
    public static int firstApproach(int num){
        // recursive
        // Time Complexity : O(n)
        // Space Complexity : O(n)
        if(num <= 2) return num;
        return firstApproach(num-1) * num;
    }

    public static int iterative(int num){
        // iterative
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        if(num == 0) return 1;

        int ans = 1;
        for(int i = 2; i <= num; i++){
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
//        int ans = firstApproach(5);
        int ans = iterative(6);
        System.out.println(ans);
    }
}
