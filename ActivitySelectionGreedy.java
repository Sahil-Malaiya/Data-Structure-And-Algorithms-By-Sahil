import java.util.ArrayList;

public class ActivitySelectionGreedy {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int mazAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        mazAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                mazAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activities is : " + mazAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
