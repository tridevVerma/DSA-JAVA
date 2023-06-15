public class reverseDigits {
    public static int iterative(int num){
        // Time Complexity : O(log(10) num)
        // Space Complexity: O(1)
        int rev = 0;
        while(num > 0){
            rev += num % 10;
            rev *= 10;
            num /= 10;
        }
        return rev / 10;
    }

    public  static int recursive(int num, int ans){
        // Time Complexity : O(log(10) num)
        // Space Complexity: O(log(10) num)
        if(num == 0) return ans;

        int temp = num % 10;
        ans = ans * 10 + temp;
        return recursive(num / 10, ans);
    }

    public static void main(String[] args) {
        System.out.println(recursive(543, 0));
    }
}
