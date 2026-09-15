class Solution {

    int row;
    int col;
    int ans = 0;
    int empty = 0;

    public int uniquePathsIII(int[][] grid) {

        row = grid.length;
        col = grid[0].length;

        int sr = 0;
        int sc = 0;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {

                if (grid[r][c] == 0) {
                    empty++;
                }

                if (grid[r][c] == 1) {
                    sr = r;
                    sc = c;
                }
            }
        }

        dfs(grid, sr, sc, 0);

        return ans;
    }

    void dfs(int[][] grid, int r, int c, int count) {

        if (r < 0 || r >= row || c < 0 || c >= col) {
            return;
        }

        if (grid[r][c] == -1) {
            return;
        }

        if (grid[r][c] == 2) {
            if (count == empty) {
                ans++;
            }
            return;
        }

        
        int value = grid[r][c];

       
        grid[r][c] = -1;

        if (value == 0) {
            count++;
        }

      
        dfs(grid, r - 1, c, count);


        dfs(grid, r + 1, c, count);

        
        dfs(grid, r, c - 1, count);

        
        dfs(grid, r, c + 1, count);

       
        grid[r][c] = value;
    }
}