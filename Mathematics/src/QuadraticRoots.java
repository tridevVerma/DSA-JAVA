import java.util.ArrayList;

public class QuadraticRoots {
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        //  Time Complexity : theta(1);
        //  Space Complexity : theta(1);

        ArrayList<Integer> ans = new ArrayList<>();
        double D = Math.pow(b, 2) - 4 * a * c;
        if(D < 0){
            ans.add(-1);
            return ans;
        }
        int root1 = (int) Math.floor((-b + Math.sqrt(D)) / (2 * a));
        int root2 = (int) Math.floor((-b - Math.sqrt(D)) / (2 * a));
        if(root1 >= root2){
            ans.add(root1);
            ans.add(root2);
        }
        else{
            ans.add(root2);
            ans.add(root1);
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = quadraticRoots(5, -7, 12);
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
