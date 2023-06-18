public class PowerOf2 {
    public static boolean powerOf2(int num){
        boolean isSet = false;
        while(num > 0){
            if((num & 1) == 1){
                if(!isSet){
                    isSet = true;
                }
                else{
                    return false;
                }
            }
            num >>= 1;
        }
        return true;
    }

    public static boolean efficient(int num){
        if(num == 0) return false;

        return (num & (num - 1)) == 0;
    }
    public static void main(String[] args) {

//        System.out.println(powerOf2(32));
        System.out.println(efficient(32));
    }
}
