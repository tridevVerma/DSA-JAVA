public class PowerOfNumbers {
    public static long power(int n, int r){
        if(n == 0) return 0;
        if(r == 0) return 1;
        if(r == 1) return n;

        if(r % 2 == 0){
            // power is even
            long ans = power(n, r / 2);
            return (ans * ans) % 1000000007;
        }
        else{
            // power is odd
            return (n * power(n, r-1) % 1000000007);
        }
    }
    public static void main(String[] args) {
        long ans = power(12, 21);
        System.out.println(ans);
    }
}
