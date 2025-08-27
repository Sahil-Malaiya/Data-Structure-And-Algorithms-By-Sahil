public class Suduko {

    public static void printsuduko(int sudoko[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean sudokosolver(int sudoko[][], int rows, int col) {
        // Correct base case
        if (rows == 9) {
            return true;
        }

        // Move to next row if col finishes
        int NextRows = rows, Nextcol = col + 1;
        if (col + 1 == 9) {
            NextRows = rows + 1;
            Nextcol = 0;
        }

        // If cell already filled, skip it
        if (sudoko[rows][col] != 0) {
            return sudokosolver(sudoko, NextRows, Nextcol);
        }

        // Try all digits 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoko, rows, col, digit)) {
                sudoko[rows][col] = digit;

                if (sudokosolver(sudoko, NextRows, Nextcol)) {
                    return true;
                }

                // Backtrack
                sudoko[rows][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoko[][], int rows, int col, int digit) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (sudoko[rows][j] == digit)
                return false;
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (sudoko[i][col] == digit)
                return false;
        }

        // Check 3x3 grid
        int sr = (rows / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoko[i][j] == digit)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (sudokosolver(sudoku, 0, 0)) {
            System.out.println("Solution is possible:");
            printsuduko(sudoku);
        } else {
            System.out.println("No solution is possible.");
        }
    }
}
