public class SubsetsOfString {
    public static void subsets(String str, String res){
        // Time Complexity : O(2^n)
        // Space Complexity : O(n)

        if(str.length() == 0){
            System.out.println(res);
            return;
        }
        // take it
        subsets(str.substring(1), res + str.charAt(0));
        // not take it
        subsets(str.substring(1), res);

    }
    public static void main(String[] args) {
        subsets("abc", "");
    }
}
