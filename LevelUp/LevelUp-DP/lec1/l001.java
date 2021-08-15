public class l001 {

    /*
     * 1. Faith 2. Recursive Tree 3. Recursion Code 4. Convert recursion code into
     * memoization 5. observation 6. tabulation 7. optimization
     */

    // Faith : f(n) = f(n-1) + f(n-2)

    // memoiztion
    public static int fibo_memo(int n, int[] dp) {
        if (n <= 1)
            return dp[n] = n;

        if (dp[n] != 0)
            return dp[n];
        int ans = fibo_memo(n - 1, dp) + fibo_memo(n - 2, dp);
        return dp[n] = ans;
    }

    // tabulation
    public static int fibo_tabu(int N, int[] dp) {
        for (int n = 0; n <= N; n++) {
            if (n <= 1) {
                dp[n] = n;
                continue;
            }

            int ans = dp[n - 1] + dp[n - 2];
            dp[n] = ans;
        }

        return dp[N];
    }

    // optimization
    public static int fibo_opti(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void display(int[] dp) {
        for (int ele : dp) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void fibo_set() {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(fibo_memo(n, dp));
        System.out.println(fibo_tabu(n, dp));
        System.out.println(fibo_opti(n));

        display(dp);
    }

}