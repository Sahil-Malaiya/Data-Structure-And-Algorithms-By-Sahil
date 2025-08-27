import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {

            return n;
        }
        int FNm1 = fib(n - 1); // Logic

        int FNm2 = fib(n - 2);
        int FibN = FNm1 + FNm2;
        return FibN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your number for fibonacci sequence :");
        n = sc.nextInt();
        System.out.println("Fibonacci of your number will be :" + fib(n));
    }
}
