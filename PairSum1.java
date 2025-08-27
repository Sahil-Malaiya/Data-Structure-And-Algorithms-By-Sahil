import java.util.ArrayList;

public class PairSum1 {
    // public static boolean pairsum1(ArrayList<Integer> pairSum, int target) {
    // for (int i = 0; i < pairSum.size(); i++) {
    // for (int j = i + 1; j < pairSum.size(); j++) {
    // if (pairSum.get(i) + pairSum.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // based on two Pointer approach
    public static boolean pointerApproach(ArrayList<Integer> pairSum, int target) {
        int lp = 0;
        int rp = pairSum.size() - 1;
        while (pairSum.get(lp) < pairSum.get(rp)) {
            if (pairSum.get(lp) + pairSum.get(rp) == target) {
                return true;
            }
            if (pairSum.get(lp) + pairSum.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pairSum = new ArrayList<>();
        pairSum.add(1);
        pairSum.add(2);
        pairSum.add(3);
        pairSum.add(4);
        pairSum.add(5);
        pairSum.add(6);

        int target = 5;
        // System.out.println(pairsum1(pairSum, target));
        System.out.println(pointerApproach(pairSum, target));
    }
}
