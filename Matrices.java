import java.util.Scanner;

public class Matrices {
    public static boolean search(int matrices[][], int key) {
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[0].length; j++) {
                if (matrices[i][j] == key) {
                    System.out.println("Key Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found at cell");
        return false;
    }

    public static void main(String[] args) {
        int matrices[][] = new int[3][3];
        // matrices ke row aur column find karna n row hy jo pahle ata hy aur m column
        // hy
        int n = matrices.length, m = matrices[0].length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrices[i][j] = sc.nextInt(); // input
                if (matrices[i][j] < min) {
                    min = matrices[i][j];
                } else {
                    max = matrices[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrices[i][j] + " "); // print karvane ke liye println ka use nahi karna hy
            }
            System.out.println();
        }
        System.out.println(min);
        System.out.println(max);
        search(matrices, 5);
    }
}
