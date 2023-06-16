import java.util.Arrays;

public class SieveOfEratosthenes {
    public static boolean checkPrime(int n){
        //  Time Complexity: O(sqrt(n))
        //  Auxiliary Space: O(1)

        if(n == 0 || n == 1) return false;
        else if(n == 2 || n == 3) return true;
        else if(n % 2 == 0 || n % 3 == 0) return false;
        else{
            for(int i = 5; i * i <= n; i += 6){
                if(n % i == 0 || n % (i + 2) == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void firstApproach(int num){
        //  Time Complexity: O(n * sqrt(n))
        //  Auxiliary Space: O(1)

        for(int i = 2; i <= num; i++){
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void efficientApproach(int num){
        //  Time Complexity: O(n * log(log n))
        //  Auxiliary Space: O(n)

        boolean[] isPrimeArr = new boolean[num + 1];

        Arrays.fill(isPrimeArr, true);

        for(int i = 2; i * i <= num; i++){
            if(isPrimeArr[i]) {
                //  Get all multiples of i and mark them as false
                for (int j = 2 * i; j <= num; j += i) {
                    isPrimeArr[j] = false;
                }
            }
        }

        for(int i = 2; i <= num; i++){
            if(isPrimeArr[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static void allInOne(int num){
        //  Time Complexity: O(n * log(log n))
        //  Auxiliary Space: O(n)

        boolean[] isPrimeArr = new boolean[num + 1];

        Arrays.fill(isPrimeArr, true);

        for(int i = 2; i <= num; i++){
            if(isPrimeArr[i]){
                System.out.print(i + " ");
                for(int j = i * i; j <= num; j += i){
                    isPrimeArr[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
//    efficientApproach(50);
    allInOne(19);
    }
}
