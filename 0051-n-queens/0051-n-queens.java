class Solution {

    private boolean isSafe(int row, int column, List<String> board, int boardSize) {
        int tempRow = row;
        int tempColumn = column;
        while (tempRow >= 0 && tempColumn >= 0) {
            if ((board.get(tempRow).charAt(tempColumn)) == 'Q')
                return false;
            tempRow--;
            tempColumn--;
        }
        tempRow = row;
        tempColumn = column;
        while (tempColumn >= 0) {
            if (board.get(tempRow).charAt(tempColumn) == 'Q')
                return false;
            tempColumn--;
        }
        tempRow = row;
        tempColumn = column;
        while (tempRow < boardSize && tempColumn >= 0) {
            if (board.get(tempRow).charAt(tempColumn) == 'Q')
                return false;
            tempRow++;
            tempColumn--;
        }
        return true;
    }

    private void solveNQueenProblem(int column, List<String> board, List<List<String>> ans, int boardSize) {
        if (column == boardSize) // over, acepted case
        {
            ans.add(new ArrayList<>(board));
            return;
        }
        for (int row = 0; row < boardSize; row++) {
            if (this.isSafe(row, column, board, boardSize)) {
                StringBuilder newRow = new StringBuilder(board.get(row));
                newRow.setCharAt(column, 'Q');
                board.set(row, newRow.toString());
                this.solveNQueenProblem(column + 1, board, ans, boardSize);
                newRow = new StringBuilder(board.get(row));
                newRow.setCharAt(column, '.');
                board.set(row, newRow.toString()); // removing the Q placed before when recursion happened, IMPORTANT
                                          // Step!.

            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>(n);
        String s = ".".repeat(n);
        for (int i = 0; i < n; i++)
            board.add(s); // initialize each row of chess board

        solveNQueenProblem(0, board, ans, n);
        return ans;
    }
}