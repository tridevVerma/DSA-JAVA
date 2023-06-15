public class TermOfGP {
    public static double termOfGP(int A,int B,int N) {
        //Your code here
        return Math.pow(B, N - 1) / Math.pow(A, N - 2);
    }
    public static void main(String[] args) {
        System.out.println(termOfGP(2, 3, 5));
    }
}
