import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPairGreedy {
    public static void main(String[] args) {
        int[][] pair = { { 5, 24 }, { 15, 25 }, { 27, 40 }, { 50, 60 } };
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int chainlen = 0;
        int chainEnd = pair[0][1];
        for (int i = 0; i < pair.length; i++) {
            if (pair[i][0] > chainEnd) {
                chainlen++;
                chainEnd = pair[i][1];
            }
        }
        System.out.println("ChainLength is : " + chainlen);
    }
}
