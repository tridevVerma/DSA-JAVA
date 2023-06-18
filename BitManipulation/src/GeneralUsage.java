public class GeneralUsage {

    public static int set_a_bit(int num, int pos){
        int i = 1;
        while(pos > 0){
            i <<= 1;
            pos--;
        }
        return num | i;
    }

    public static int unset_a_bit(int num, int pos){
        int i = 1;
        while(pos > 0){
            i <<= 1;
            pos--;
        }
        i = ~i;
        return num & i;
    }

    public static String even_odd(int num){
        return (num & 1) == 1 ? "odd" : "even";
    }

    public static int divideBy2(int num){
        return num >> 1;
    }

    public static int multiplyBy2(int num){
        return num << 1;
    }

    public static int log2(int num){
        int ans = 0;
        while(num > 1){
            ans++;
            num >>= 1;
        }
        return ans;
    }

    public static void swap(int a, int b){
        System.out.println("Before change a:" + a + " b:" + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("After change a:" + a + " b:" + b);
    }

    public static void main(String[] args) {
        System.out.println(set_a_bit(8, 2));
        System.out.println(unset_a_bit(25, 3));
        System.out.println(even_odd(28));
        System.out.println(divideBy2(8));
        System.out.println(multiplyBy2(8));
        System.out.println(log2(10));
        swap(25, 45);
    }
}
