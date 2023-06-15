public class checkPrime {
    public static boolean firstApproach(int num){
        //  Time complexity: O(sqrt(n))
        //  Auxiliary space: O(1)

        if(num == 1) return false;
        if(num == 2 || num == 3) return true;

        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean efficientApproach(int num){
        //  Time complexity: O(sqrt(n))
        //  Auxiliary space: O(1)

        if(num == 1) return false;
        if(num == 2 || num == 3) return true;

        if(num % 2 == 0 || num % 3 == 0) return false;

        for(int i = 5; i * i <= num; i += 6){
            if(num % i == 0 || num % (i+2) == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        boolean ans = efficientApproach(59);
        System.out.println(ans ? "Yes" : "No");
    }
}
