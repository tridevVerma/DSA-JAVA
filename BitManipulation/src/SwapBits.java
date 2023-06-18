public class SwapBits {
    //Function to swap odd and even bits.
    public static int swapBits(int n){
        //  Time Complexity : O(1)
        //  Space Complexity : O(1)

        //  Masking :-
        //  A - 1010 x 8 times --> preserve even bits
        //  A - 0101 x 8 times --> preserve odd bits
        int res1 = n & 0xAAAAAAAA;
        int res2 = n & 0x55555555;

        // Right shift --> get all event bits to odd position
        // Left shift --> get all odd bits to even position
        // Or will combine results
        return (res1 >> 1) | (res2 << 1);
    }

    public static void main(String[] args) {
        System.out.println(swapBits(52));
    }
}
