import java.util.ArrayList;

public class PrintKeypadPermutations {
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int a[], int N, int index) {
        // Time Complexity : O(4^N * N)
        // Space Complexity : O(N)

        if(index == N) return new ArrayList<>();
        if(index + 1 == N) {
            ArrayList<String> res = new ArrayList<>();
            String val = keypad[a[index]];
            for(int i = 0; i < val.length(); i++){
                res.add("" + val.charAt(i));
            }

            return res;
        }

        ArrayList<String> smallAns = possibleWords(a, N, index + 1);
        String val = keypad[a[index]];
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < val.length(); i++){
            for(int j = 0; j < smallAns.size(); j++){
                ans.add(val.charAt(i) + smallAns.get(j));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4};
        ArrayList<String> ans = possibleWords(arr, arr.length, 0);
        System.out.println(ans);
    }
}
