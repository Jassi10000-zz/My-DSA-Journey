public class leet200 {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int countOfIslands = 0;

        int[][] direction = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs_noOfIslands(grid, i, j, direction);
                    countOfIslands++;
                }
            }
        }
    }

    public void dfs_noOfIslands(char[][] grid, int i, int j, int[][] direction) {

        // mark the src true , we can assign any value 0 , 2 or anything , except 1
        grid[i][j] = '0';
        int n = grid.length, m = grid[0].length;

        for (int d = 0; d < 4; d++) {
            int r = i + direction[d][0];
            int c = j + direction[d][1];
            if (r >= 0 && c >= 0 && r < n && c < m && grid[r][c] == '1') {
                dfs_noOfIslands(grid, r, c, direction);
            }
        }

    }
}

// Time Complexity : O(E+V)
// But in worst case : there can all be the 1's in the matrix , so E = V^2
// So Worst case time complexity is O(V^2)

// which can also said that O(E+V) evaluates to O(n*m)
