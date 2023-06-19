public class DigitalRoot {
    public static int digitalRoot(int n){
        // Time Complexity : O(digits in n)
        // Space Complexity : O(digits in n)

        if(n < 10) return n;
        return digitalRoot(n % 10 + digitalRoot(n / 10));
    }
    public static void main(String[] args) {
        int num = 99999;
        System.out.println(digitalRoot(num));
    }
}
