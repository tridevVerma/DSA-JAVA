public class MatchStickGame {
    public static int AWins(long n){
        if(n % 5 == 0) return -1;
        return (int)(n % 5);
    }

    public static void main(String[] args) {
        long n = 14;
        System.out.println(AWins(n));
    }
}
