public class CountDigits {
    public static int firstApproach(int num){
        //  Time Complexity : theta(number of digits in input no)
        //  Space Complexity: theta(1)
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }

    public static int recursive(int num){
        // Time Complexity : theta(log(10)n)
        //  Space Complexity: theta(1)
        if(num / 10 == 0){
            return 1;
        }
        return 1 + recursive(num / 10);
    }
    public static void main(String[] args) {
//        System.out.println(firstApproach(428698));
        System.out.println(recursive(6980));
    }
}
