public class MaximumIndexDiff {
    static int getMax(int x, int y) {
        return x > y ? x : y;
    }

    static int getMin(int x, int y) {
        return x > y ? y : x;
    }

    static int maxIndexDiff(int A[], int N) {
        int[] lmin = new int[N];
        int[] rmax = new int[N];

        lmin[0] = A[0];
        for(int i = 1; i < N; i++){
            lmin[i] = getMin(A[i], lmin[i-1]);
        }

        rmax[N-1] = A[N-1];
        for(int j = N-2; j >= 0; j--){
            rmax[j] = getMax(A[j], rmax[j+1]);
        }

        int i = 0, j = 0, max = -1;
        while(i < N && j < N){
            if(lmin[i] <= rmax[j]){
                max = getMax(max, j-i);
                j++;
            }
            else{
                i++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int ans = maxIndexDiff(arr, arr.length);
        System.out.println(ans);
    }
}
