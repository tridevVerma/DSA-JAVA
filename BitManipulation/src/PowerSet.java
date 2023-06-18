public class PowerSet {
    public static void printSubsets(String str){
        //  Time Complexity : theta((2^n) * log2(n))
        //  Space Complexity : theta(1)

        int n = (int)Math.pow(2, str.length());

        for(int i = 0; i < n; i++){

            String res = "";
            int pos = 0, temp = i;

            while(temp > 0){
                if((temp & 1) == 1){
                    res += str.charAt(pos);
                }
                pos++;
                temp >>= 1;
            }
            System.out.println(res);
        }

    }

    public static void efficientApproach(String str){
        //  Time Complexity : theta((n^2) * log2(n))
        //  Space Complexity : theta(1)

        int n = str.length();
        int totalSubsets = 1 << n;
        for (int i = 0; i < totalSubsets; i++) {
            String res = "";

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    res += str.charAt(j);
                }
            }

            System.out.println(res);
        }
    }
    public static void main(String[] args) {
//        printSubsets("ab");
        efficientApproach("ab");
    }
}
