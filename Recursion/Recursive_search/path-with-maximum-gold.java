class Solution {

    int rows;
    int cols;

    public int getMaximumGold(int[][] grid) {

        rows = grid.length;
        cols = grid[0].length;

        int maxGold = 0;

        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (grid[r][c] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, r, c));
                }
            }
        }

        return maxGold;
    }

    private int dfs(int[][] grid, int r, int c) {

        
        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            return 0;
        }

        
        if (grid[r][c] == 0) {
            return 0;
        }

       
        int gold = grid[r][c];

      
        grid[r][c] = 0;

       
        int up = dfs(grid, r - 1, c);
        int down = dfs(grid, r + 1, c);
        int left = dfs(grid, r, c - 1);
        int right = dfs(grid, r, c + 1);

       
        grid[r][c] = gold;


        return gold + Math.max(
                Math.max(up, down),
                Math.max(left, right)
        );
    }
}