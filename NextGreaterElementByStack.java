import java.util.*;

public class NextGreaterElementByStack {
    public static void main(String[] args) {
        int arr[] = { 5, 12, 6, 4, 2, 1, 7 };
        Stack<Integer> s = new Stack();
        int nextGreater[] = new int[arr.length];

        // backward traversal
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        // Printing NextGreater Elements
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
