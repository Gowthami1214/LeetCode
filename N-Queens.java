class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<List<String>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(".");
            }
            board.add(row);
        }
        solve(0, n, board, result);
        return result;
    }

    void solve(int row, int n, List<List<String>> board, List<List<String>> result) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(board.get(i).get(j));
                }
                temp.add(sb.toString());
            }
            result.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board.get(row).set(col, "Q");
                solve(row + 1, n, board, result);
                board.get(row).set(col, ".");
            }
        }
    }

    boolean isSafe(List<List<String>> board, int row, int col, int n) {
        for (int i = col - 1; i >= 0; i--) {
            if (!board.get(row).get(i).equals(".")) {
                return false;
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            if (!board.get(i).get(col).equals(".")) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (!board.get(i).get(j).equals(".")) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (!board.get(i).get(j).equals(".")) {
                return false;
            }
        }
        return true;
    }
}
