import java.util.Scanner;

public class TilingProblem {
    public static int tilingProb(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertivcal
        int fnm1 = tilingProb(n - 1);
        // horizontal
        int fnm2 = tilingProb(n - 2);

        // totalways
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you breadth for  2 X ");
        int n = sc.nextInt();
        System.out.println("Total number of ways of tiling : " + tilingProb(n));

    }
}
