public class CountDigitsInFactorial {
    public static int digitsInFactorial(int N){
        // code here
        //  log(n!) = log(n*(n-1)*(n-2)....2*1) = log(n) + log(n-1) + log(n-2) + .... + log(2) + log(1)
        if(N == 0) return 1;
        double ans = 0;
        for(int i = 1; i <= N; i++){
            ans += Math.log10(i);
        }
        return (int)Math.floor(ans) + 1;
    }

    public static void main(String[] args) {
        System.out.println(digitsInFactorial(120));
    }
}
