public class PrintPrimeFactors {
    public static boolean checkPrime(int n){
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
        //  Time Complexity : O(nlogn)
        //  Space Complexity : O(1)

        for(int i = 2; i < num; i++){
            if(checkPrime(i)){
                int temp = i;
                while(num % temp == 0){
                    System.out.print(i + " ");
                    temp *= i;
                }
            }
        }
    }

    public static void efficientApproach(int num){
        if(num <= 1){
            return;
        }

        for(int i = 2; i * i <= num; i++){
            while(num % i == 0){
                System.out.print(i + " ");
                num /= i;
            }
        }

        if(num > 1){
            System.out.print(num);
        }

    }
    public static void main(String[] args) {
//        firstApproach(12);
        efficientApproach(12);
    }

}
