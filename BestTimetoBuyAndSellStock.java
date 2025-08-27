public class BestTimetoBuyAndSellStock {
    public static int profit(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(profit(price));
    }
}
