class Solution {

    int rows;
    int cols;

    public boolean exist(char[][] board, String word) {

        rows = board.length;
        cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word,
                        int r, int c, int index) {

        
        if (r < 0 || r >= rows ||
            c < 0 || c >= cols) {
            return false;
        }

        
        if (board[r][c] != word.charAt(index)) {
            return false;
        }

        
        if (index == word.length() - 1) {
            return true;
        }

       
        char temp = board[r][c];
        board[r][c] = '#';

       
        if (dfs(board, word, r - 1, c, index + 1)) {
            return true;
        }

       
        if (dfs(board, word, r + 1, c, index + 1)) {
            return true;
        }

        
        if (dfs(board, word, r, c - 1, index + 1)) {
            return true;
        }

       
        if (dfs(board, word, r, c + 1, index + 1)) {
            return true;
        }

       
        board[r][c] = temp;

        return false;
    }
}