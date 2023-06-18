public class RightMosDiffBit {
    public static int posOfRightMostDiffBit(int m, int n){

        // Your code here
        if(m == n) return -1;
        int ans = m ^ n;
        return 1 + (int)(Math.log10(ans & (-ans)) / Math.log10(2));
    }

    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(52, 4));
    }
}
