import java.util.Arrays;

public class MinimumAbsoulteDiff {
    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        // Array sort
        Arrays.sort(A);
        Arrays.sort(B);
        int minimumAbsoulteDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minimumAbsoulteDiff = minimumAbsoulteDiff + Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimum Absolute Diff is :" + minimumAbsoulteDiff);
    }
}
