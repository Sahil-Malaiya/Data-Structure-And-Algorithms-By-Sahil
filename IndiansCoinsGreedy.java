import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndiansCoinsGreedy {
    public static void main(String[] args) {
        Integer coins[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        int amount = 590;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        System.out.println(count);
    }
}
