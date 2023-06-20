public class PrintPermutations {
    //  Time Complexity : O(n ^ n)
    //  Space Complexity : O(S)

    public static void printPermutations(String str, String ans){
        if(str.length() <= 1) {
            System.out.println(ans + str);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            printPermutations(str.substring(0, i) + str.substring(i+1), ans + str.charAt(i));
        }

    }
    public static void main(String[] args) {
        printPermutations("ABC", "");
    }
}
