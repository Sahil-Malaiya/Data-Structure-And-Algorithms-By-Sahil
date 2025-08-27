public class FibonacciInDp {
    public static int fib(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) { // agar zero nahi hy to vo calculate ho gaya hy
            return f[n];
        }
        f[n] = fib(n - 1, f) + fib(n - 2, f); // agar calculate nahi hua hy to;
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1];
        System.out.print(fib(n, f));
    }
}
