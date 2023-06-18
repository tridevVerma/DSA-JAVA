public class Palindrome {
    public static boolean checkPalindrome(String str){
        // Time Complexity : theta(n) where n is string length
        // Space Complexity : theta(n)

        if(str.length() <= 1){
            return true;
        }
        // Check for first and last character and leave rest to recursion
        if(str.charAt(0) == str.charAt(str.length() - 1) && checkPalindrome(str.substring(1, str.length() - 1))){
            return true;
        }
        return false;
    }

    public static boolean checkPalindromeUsingPointers(String str, int start, int end){
        // Time Complexity : theta(n) where n is string length
        // Space Complexity : theta(n)

        if(start >= end){
            return true;
        }

        return str.charAt(start) == str.charAt(end) && checkPalindromeUsingPointers(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
//        System.out.println(checkPalindrome("aba"));
        System.out.println(checkPalindromeUsingPointers("abacbba", 0, 6));
    }
}
