import java.util.Arrays;

public class JosephusProblem {

    public static int foundSurvivor(int n, int k){
        //  Time Complexity : theta(n)
        if(n == 1){
            return 0;
        }

        int ans = foundSurvivor(n-1, k);
        return (k + ans) % n;
    }

    public static int foundSurvivor1ToN(int n, int k){
        if(n == 1){
            return 1;
        }

        int ans = foundSurvivor1ToN(n-1, k);
        return ((k + (ans-1)) % n) + 1;
    }

    public static void main(String[] args) {
        int n = 7, k = 3;
        int ans = foundSurvivor1ToN(n, k);
        System.out.println(ans);
    }
}
