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

    public static void display2D(int[][] dp) {
        for (int[] ar : dp) {
            display(ar);
        }
        System.out.println();
    }

    // func to call the functions
    public static void fibo_set() {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(fibo_memo(n, dp));
        System.out.println(fibo_tabu(n, dp));
        System.out.println(fibo_opti(n));

        display(dp);
    }

    // ************************************** Question 2
    // ********************************************************

    // rat in maze : go from src to dest

    // Faith : total no of paths from all directions will be the final ans

    // memoization
    public static int mazepath_memoization(int startingRow, int startingColumn, int endingRow, int endingColumn,
            int[][] dir, int[][] dp) {
        int count = 0;
        if (startingRow == endingRow && startingColumn == endingColumn) {
            return 1;
        }

        if (dp[startingRow][startingColumn] != 0) {
            return dp[startingRow][startingColumn];
        }
        for (int[] d : dir) {
            int r = startingRow + d[0];
            int c = startingColumn + d[1];

            // r >= 0 && c >= 0 --> this condition can be removed as we are not going this
            // back
            if (r >= 0 && c >= 0 && r <= endingRow && c <= endingColumn) {
                count += mazepath_memoization(r, c, endingRow, endingColumn, dir, dp);
            }
        }
        return dp[startingRow][startingColumn] = count;
    }

    // tabulation
    public static int mazepath_Tabulation(int SR, int SC, int er, int ec, int[][] dir, int[][] dp) {
        for (int startingRow = er; startingRow >= SR; startingRow--) {
            for (int startingColumn = ec; startingColumn >= SC; startingColumn--) {
                if (startingRow == er && startingColumn == ec) {
                    dp[startingRow][startingColumn] = 1;
                    continue;
                }

                int count = 0;

                for (int[] d : dir) {
                    int r = startingRow + d[0];
                    int c = startingColumn + d[1];

                    if (r >= 0 && c >= 0 && r <= er && c <= ec) {
                        count += dp[r][c];
                    }
                    // this is for the jump stratergy
                    // while (r >= 0 && c >= 0 && r < er && c < ec) {
                    // count += dp[r][c];
                    // r += d[0];
                    // c += d[1];
                    // }
                }
                dp[startingRow][startingColumn] = count;
            }
        }

        return dp[SR][SC];
    }

    // tabulation with jump stratergy
    public static int mazepath_TabulationJump(int SR, int SC, int er, int ec, int[][] dir, int[][] dp) {
        for (int startingRow = er; startingRow >= SR; startingRow--) {
            for (int startingColumn = ec; startingColumn >= SC; startingColumn--) {
                if (startingRow == er && startingColumn == ec) {
                    dp[startingRow][startingColumn] = 1;
                    continue;
                }

                int count = 0;

                for (int[] d : dir) {
                    int r = startingRow + d[0];
                    int c = startingColumn + d[1];

                    // this is for the jump stratergy
                    while (r >= 0 && c >= 0 && r < er && c < ec) {
                        count += dp[r][c];
                        r += d[0];
                        c += d[1];
                    }
                }
                dp[startingRow][startingColumn] = count;
            }
        }

        return dp[SR][SC];
    }

    public static void mazepath_set() {
        int startingRow = 0, startingColumn = 0, endingRow = 7, endingColumn = 11;
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } };
        int[][] dp = new int[endingRow + 1][endingColumn + 1];
        System.out.println(mazepath_memoization(startingRow, startingColumn, endingRow, endingColumn, dir, dp));
        // System.out.println(mazepath_Tabulation(startingRow, startingColumn,
        // endingRow, endingColumn, dir, dp));

        display2D(dp);
    }

    public static void main(String[] args) {
        mazepath_set();
    }

}