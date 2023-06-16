import java.util.ArrayList;

public class PrintDivisors {
    public static void firstApproach(int num){
        //  Time Complexity: O(n)
        //  Auxiliary Space: O(1)

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i + " ");
            }
        }

    }

    public static void notSorted(int num){
        //  Time Complexity: O(sqrt(n))
        //  Auxiliary Space: O(1)

        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
                if(i * i != num){
                    System.out.print((num / i) + " ");
                }
            }
        }
    }

    public static void efficientApproach(int num){
        //  Time Complexity: O(sqrt(n))
        //  Auxiliary Space: O(1)

        int i = 1;
        for(; i * i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }

        if(i - (num / i) == 1){
            i--;
        }
        for(; i * i >= 1; i--){
            if(num % i == 0){
                System.out.print((num / i) + " ");
            }
        }
    }

    public static void mostEfficient(int num){
        // use array
        //  Time Complexity: O(sqrt(n))
        //  Auxiliary Space: O(sqrt(n))

        ArrayList<Integer> helper = new ArrayList<>();

        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
                if(i * i != num){
                    helper.add(num / i);
                }
            }

        }

        for(int i = helper.size() - 1; i >= 0; i--){
            System.out.print(helper.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        mostEfficient( 16);
    }
}
