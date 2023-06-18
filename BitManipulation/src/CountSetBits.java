public class CountSetBits {

    private static int[] setBitsCounter;

    private static void initialize(){
        setBitsCounter = new int[256];
        setBitsCounter[0] = 0;
        for(int i = 1; i <= 255; i++){
            setBitsCounter[i] = setBitsCounter[i & (i-1)] + 1;
        }
    }

    public static int efficientApproach(int num){
        initialize();
        return setBitsCounter[num & 255] + setBitsCounter[(num >> 8) & 255] + setBitsCounter[(num >> 16) & 255] + setBitsCounter[num >> 24];
    }

    public  static int firstApproach(int num){
        int ans = 0;
        while(num > 0){
            num = num & (num - 1);
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(firstApproach(4));
        System.out.println(efficientApproach(259));
    }
}
