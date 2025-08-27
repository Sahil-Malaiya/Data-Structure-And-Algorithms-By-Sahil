public class Nqueens {
    public static void prinarr(char board[][]) {
        System.out.println("-----------Chess Board------------");
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
    // static int count =0;

    public static void nQueens(char board[][], int rows) {
        if (rows >= board.length) {
            prinarr(board); // Count karne ke liye count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, rows, j)) {
                board[rows][j] = 'Q';
                nQueens(board, rows + 1);
                board[rows][j] = 'X';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        // System.out.println(count);
    }
}
