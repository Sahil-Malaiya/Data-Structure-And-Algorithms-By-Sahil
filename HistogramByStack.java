import java.util.Stack;

public class HistogramByStack {
    public static void histoGram(int height[]) {
        int maxarea = 0;
        int nsl[] = new int[height.length];
        int nsr[] = new int[height.length];
        // next smaller left nsl
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller right nsr
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Maxarea width = heigtht + (nsr[j] - nsl[i] -1)
        for (int i = 0; i < height.length; i++) {
            int ht = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = ht * width;
            maxarea = Math.max(currarea, maxarea);
        }
        System.out.println("Max area of histogram is :" + maxarea);
    }

    public static void main(String[] args) {
        int height[] = { 4, 5, 1, 3, 2, 7 };
        histoGram(height);
    }
}