public class IncreasingOrder {
    public static void fun(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        // System.out.println(n + " ");
        // System.out.println(n);
        fun(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(5);
    }
}
