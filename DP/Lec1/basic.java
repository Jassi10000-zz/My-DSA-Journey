public class basic {

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

    }

    public static void print2D(int[][] arr) {
        for (int[] a : arr) {
            print(a);
        }

        System.out.println();
    }

    public static int fibo_memo(int n, int[] dp) {

        if (n <= 1) {
            return dp[n] = n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int ans = fibo_memo(n - 1, dp) + fibo_memo(n - 2, dp);
        return dp[n] = ans;
    }

    public static void fibo() {
        int n = 6;
        int[] dp = new int[n + 1];
        fibo_memo(n, dp);

        print(dp);
    }

    public static void main(String[] args) {
        fibo();
    }
}