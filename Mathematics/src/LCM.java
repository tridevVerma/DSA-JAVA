public class LCM {
    public static int GCD(int num1, int num2){
        return num2 == 0 ? num1 : GCD(num2, num1 % num2);
    }
    public static int firstApproach(int num1, int num2){
        //  Time Complexity: O(log(min(a,b))
        //  Auxiliary Space: O(1)

        return (num1 * num2) / GCD(num1, num2) ;
    }
    public static void main(String[] args) {
        int ans = firstApproach(2, 8);
        System.out.println(ans);
    }
}
