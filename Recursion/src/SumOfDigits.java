public class SumOfDigits {
    public static int sum(int n){
        // Time Complexity : theta(log10 n) or theta(d) where d is no of digits
        // Space Complexity : theta(log10 n) or theta(d) where d is no of digits

        if(n < 10) return n;
        return (n % 10) + sum(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(sum(0));
    }
}
