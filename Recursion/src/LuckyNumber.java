public class LuckyNumber {
    public static boolean isLucky(int n, int counter){
        //  Time Complexity : O(log(n))
        // Space Complexity : O(1)

        if(counter > n) return true;

        if(n % counter == 0) return false;
        return isLucky(n-(n/counter), counter+1);
    }
    public static void main(String[] args) {
        System.out.println(isLucky(13, 2));
    }
}
