public class NxNrowsQueenWtihoutAttacking {
    // Nqueens and n rows ke liye, attacking nahi dekh na h
    public static void printArr(char board[][]) {
        System.out.println("------------Chess Board-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int rows, int col) {

    }

    public static void nQueens(char board[][], int rows) {
        // base case
        if (rows == board.length) {
            printArr(board);
            return;
        }
        // Main logic is here
        // column call
        for (int j = 0; j < board.length; j++) { // yaha galti maat karna j ayega
            if (isSafe(board, rows, j)) {
                board[rows][j] = 'Q';
                nQueens(board, rows + 1); // function call
                board[rows][j] = '.'; // Backtracking
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // initailize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}