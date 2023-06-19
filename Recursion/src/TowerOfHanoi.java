public class TowerOfHanoi {
    public static void towerOfHanoi(int n, Character src, Character aux, Character dest){
        // Time Complexity : O(2 ^ n)
        // Space Complexity : O(n)

        if(n == 1){
            System.out.println("Move 1 from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src , dest, aux);

        System.out.println("Move " + n + " from " + src + " to " + dest);

        towerOfHanoi(n-1, aux, src, dest);

    }
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}
