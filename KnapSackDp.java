public class KnapSackDp {
    public static int knapsack(int val[], int wt[], int c, int n) {
        if (n == 0 || c == 0) {
            return 0;
        }
        if (wt[n - 1] <= c) {
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, c - wt[n - 1], n - 1);
            // exclude
            int ans2 = knapsack(val, wt, c, n - 1);
            return Math.max(ans1, ans2);
        } else {
            // Not valid
            return knapsack(val, wt, c, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int c = 7;
        System.out.print(knapsack(val, wt, c, val.length));
    }
}
