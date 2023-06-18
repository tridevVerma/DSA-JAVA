public class LongestConsecutive1 {
    public static int maxConsecutiveOnes(int N) {

        //  Time Complexity : theta(log2n)
        //  Space Complexity : theta(1)

        int count = 0, max = 0;
        while(N > 0){
            if((N & 1) == 1){
                count++;
            }
            else{
                if(count > max){
                    max = count;
                }
                count = 0;
            }
            N >>= 1;
        }

        return max > count ? max : count;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(45));
    }
}
