public class CuttingRopes {
    public static int cuttingRopes(int n, int a, int b, int c){
        // Time Complexity : O(3^n)
        // Space Complexity : O(n)

        if(n < 0) return -1;

        if(n == 0){
            return 0;
        }

        int ans1 = cuttingRopes(n-a, a, b, c);
        int ans2 = cuttingRopes(n-b, a, b, c);
        int ans3 = cuttingRopes(n-c, a, b, c);

        int res = Math.max(ans1, Math.max(ans2, ans3));
        if(res == -1) return -1;
        return res + 1;
    }
    public static void main(String[] args) {
        System.out.println(cuttingRopes(5, 5, 2, 1));
        System.out.println(cuttingRopes(23, 11, 9, 12));
        System.out.println(cuttingRopes(9, 2, 2, 2));
    }
}
