public class GCD {
    public static int firstApproach(int num1, int num2){
        //  recursive
        // Time Complexity : O(min(num1, num2))
        // Space Complexity: O(min(num1, num2))
        if(num1 == num2){
            return num1;
        }
        if(num1 > num2){
            return firstApproach(num1-num2, num2);
        }
        else{
            return firstApproach(num1, num2 - num1);
        }

    }

    public static int secondApproach(int num1, int num2){
        //  iterative
        // Time Complexity : O(min(num1, num2))
        // Space Complexity: O(min(num1, num2))

        while(num1 != num2){
            if(num1 > num2){
                num1 -= num2;
            }
            else{
                num2 -= num1;
            }
        }

        return num1;

    }

    public static int efficientApproach(int num1, int num2){
        //  Time Complexity: O(log(min(a,b))
        //  Auxiliary Space: O(1)

        if(num2 == 0){
            return num1;
        }

        return efficientApproach(num2, num1 % num2);
    }
    public static void main(String[] args) {
        int ans = efficientApproach(72, 12);
        System.out.println(ans);
    }
}
