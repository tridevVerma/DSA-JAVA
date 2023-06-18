public class MSBit {

    public static int log2(int num){
        int ans = 0;
        while(num > 1){
            ans++;
            num >>= 1;
        }
        return ans;
    }
    public static int msb(int num){
        return (int)Math.pow(2, log2(num));
    }


    public static void main(String[] args) {
        System.out.println(msb(17));
    }
}
