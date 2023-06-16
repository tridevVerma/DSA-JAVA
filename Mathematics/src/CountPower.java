public class CountPower {
    public static int recursive(int x, int n){
        //  recursive
        //  Time Complexity: O(n)
        //  Auxiliary Space: O(n)

        if(n == 0) return 1;
        if(n == 1) return x;

        return x * recursive(x, n - 1);
    }

    public static int iterative(int x, int n){
        //  iterative
        //  Time Complexity: O(n)
        //  Auxiliary Space: O(1)

        if(n == 0) return 1;
        if(n == 1) return x;

        int ans = 1;
        while(n-- > 0){
            ans *= x;
        }

        return ans;
    }

    public static int efficient(int x, int n){
        //  Time Complexity: O(1)
        //  Auxiliary Space: O(1)

        if(n == 0) return 1;
        if(n == 1) return x;

        return (int)Math.exp(n * Math.log(x));
    }

    public static int dividePower(int x, int n){
        //  Time Complexity: O(log(n))
        //  Auxiliary Space: O(log(n))

        if(n == 0){
            return 1;
        }

        int temp = dividePower(x, n / 2);
        temp *= temp;
        if(n % 2 == 0){
            return temp;
        }
        return temp * x;
    }

    public static int binaryPower(int x, int n){
        //  Time Complexity: O(log(n))
        //  Auxiliary Space: O(1)

        int ans = 1;
        while(n > 0){
          if(n % 2 != 0){
              ans *= x;
          }
          n = n / 2;
          x = x * x;
        }

        return ans;
    }

    public static int binaryPowerWithBits(int x, int n){
        //  Time Complexity: O(log(n))
        //  Auxiliary Space: O(1)

        int ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                ans *= x;
            }
            n = n >> 1;
            x = x * x;
        }

        return ans;
    }
    public static void main(String[] args) {
//        int ans = iterative(3, 3);
//        int ans = efficient(3, 3);
//        int ans = dividePower(3, 3);
//        int ans = binaryPower(2, 4);
        int ans = binaryPowerWithBits(3, 4);
        System.out.println(ans);
    }
}
