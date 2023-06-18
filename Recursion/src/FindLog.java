public class FindLog {
    public static int log(int num, int base){
        // Time Complexity : theta(log2n)
        // Space Complexity : theta(log2n)

        if(num < base){
            return 0;
        }
        return 1 + log(num / base, base);
    }
    public static void main(String[] args) {
        int base = 3, num =  81;
        System.out.println(log(num, base));
    }
}
