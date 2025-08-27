public class DecreasinOrder {
    public static void fun(int n) {
        if (n == 1) {
            System.out.print(n); // base case
            return;
        }
        System.out.print(n + " ");
        fun(n - 1);
    }

    public static void main(String[] args) {
        fun(5);
    }
}
