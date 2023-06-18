public class XOR_N {
    public static int xorOfN(int num){
        if(num % 4 == 0) return num;
        else if(num % 4 == 1) return 1;
        else if(num % 4 == 2) return num + 1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(xorOfN(7));
    }
}
