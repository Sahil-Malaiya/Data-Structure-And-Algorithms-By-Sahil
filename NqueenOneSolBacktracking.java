public class NqueenOneSolBacktracking {
    public static void prinarr(char board[][]) {
        System.out.println("--------Chess Board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int rows, int col) {
        // vertical up
        for (int i = rows - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diag left up
        for (int i = rows - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diag right up
        for (int i = rows - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][], int rows) { // yaha par boolean function hua
        if (rows >= board.length) {
            // prinarr(board);
            return true; // isko true kiya
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, rows, j)) {
                board[rows][j] = 'Q';
                if (nQueens(board, rows + 1)) {
                    return true;
                }
                board[rows][j] = '.';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible :");
            prinarr(board);
        } else {
            System.out.println("Solution is not possible");
        }
    }
}