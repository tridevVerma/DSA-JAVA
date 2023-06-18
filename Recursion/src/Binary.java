public class Binary {
    public static void binary(int num){
        // Time Complexity : theta(log2n)
        // Space Complexity : theta(log2n)

        if(num == 0) return;
        binary(num / 2);
        System.out.print(num % 2);
    }

    public static int getBinary(int num){
        // Time Complexity : theta(log2n)
        // Space Complexity : theta(log2n)
        if(num == 0) return 0;
        return getBinary(num/2) * 10 + num % 2;
    }

    public static void main(String[] args) {
//        binary(11);
        System.out.println(getBinary(34));
    }
}
