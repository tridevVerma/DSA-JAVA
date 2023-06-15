public class Count3Factors {

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        else if(num == 2 || num == 3) return true;
        else if(num % 2 == 0 || num % 3 == 0) return false;
        else{
            for(int i = 5; i * i < num; i += 6){
                if(num % i == 0 || num % (i + 2) == 0) return false;
            }
            return true;
        }

    }
    public static int firstApproach(int num){
        if(num <= 3){
            return 0;
        }
        int count = 0;
       for(int i = 2; i * i <= num; i++){
           if(isPrime(i)){
               count++;
           }
       }
       return count;
    }
    public static void main(String[] args) {
        System.out.println(firstApproach(999999));
    }
}
