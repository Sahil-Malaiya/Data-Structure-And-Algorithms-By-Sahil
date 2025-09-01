public class KnapSackDp {
    // public static int knapsack(int val[], int wt[], int c, int n) {
    // if (n == 0 || c == 0) {
    // return 0;
    // }
    // if (wt[n - 1] <= c) {
    // // include
    // int ans1 = val[n - 1] + knapsack(val, wt, c - wt[n - 1], n - 1);
    // // exclude
    // int ans2 = knapsack(val, wt, c, n - 1);
    // return Math.max(ans1, ans2);
    // } else {
    // // Not valid
    // return knapsack(val, wt, c, n - 1);
    // }
    // }

    // public static int knapsack(int val[], int wt[], int c, int n, int dp[][]) {
    // if (n == 0 || c == 0) {
    // return 0;
    // }
    // if (dp[n][c] != -1) {
    // return dp[n][c];
    // }
    // if (wt[n - 1] <= c) {
    // int ans1 = val[n - 1] + knapsack(val, wt, c - wt[n - 1], n - 1, dp);
    // // exclude
    // int ans2 = knapsack(val, wt, c, n - 1, dp);
    // dp[n][c] = Math.max(ans1, ans2);
    // return dp[n][c];
    // } else {
    // dp[n][c] = knapsack(val, wt, c, n - 1, dp);
    // return dp[n][c];
    // }
    // }

    public static int knapsack(int val[], int wt[], int c, int n) {
        int dp[][] = new int[n + 1][c + 1];
        // dp[0][c] = 0;
        // dp[n][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                if (wt[i - 1] <= j) { // Yaha galti hui thi
                    int include = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    int exclude = dp[i - 1][j];
                    dp[i][j] = Math.max(include, exclude);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][c];

    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int c = 7;

        // MemoiZation
        // int dp[][] = new int[val.length + 1][c + 1];
        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // dp[i][j] = -1;
        // }
        // }
        System.out.print(knapsack(val, wt, c, val.length));
    }
}
