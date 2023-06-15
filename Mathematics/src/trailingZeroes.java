public class trailingZeroes {

    public static int secondApproach(int num){
        //  Time Complexity: O(log5n)
        //  Auxiliary Space: O(1)

        int count = 0;

        for(int i = 5; i <= num; i *= 5){
            count += num / i;
        }
        return count;
    }
    public static void main(String[] args) {
        int ans = secondApproach(251);
        System.out.println(ans);
    }
}
