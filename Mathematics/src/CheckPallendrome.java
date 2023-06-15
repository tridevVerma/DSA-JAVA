public class CheckPallendrome {
    public static boolean firstApproach(int num){
        // convert to string
        // Time Complexity : O(string length)
        // Space Complexity: O(1)
        String str = num + "";
        int i = 0, len = str.length(), mid = len / 2;
        while(i <= mid){
            if(str.charAt(i) != str.charAt(len - i - 1)){
                return false;
            }
            i++;
        }
        return true;
    }

    public static int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev += num % 10;
            rev *= 10;
            num /= 10;
        }
        return rev / 10;
    }

    public static boolean secondApproach(int num){
        // Time Complexity : O(log(10) num)
        // Space Complexity: O(1)
        return num == reverse(num);
    }

    public static void main(String[] args) {
//        boolean ans = firstApproach(4554);
        boolean ans = secondApproach(4);
        if(ans){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
