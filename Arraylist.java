import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void swap(ArrayList<Integer> List, int idx1, int idx2) {
        int temp = List.get(idx1);
        List.set(idx1, List.get(idx2));
        List.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        // for (int i = 0; i < List.size(); i++) {
        // System.out.print(List.get(i) + " ");
        // }
        // System.out.println();
        // // Reverse List
        // for (int i = List.size() - 1; i >= 0; i--) {
        // System.out.print(List.get(i) + " ");
        // }
        // System.out.println();

        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < List.size(); i++) {
        // if (max < List.get(i)) {
        // max = List.get(i);
        // }
        // }
        // System.out.println(max);

        // Swapping
        int idx1 = 1, idx2 = 3;
        swap(List, idx1, idx2);
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);
    }
}
