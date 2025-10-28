import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int Fnm1 = fact(n - 1); // Main Logic of code
        // int fn = n * Fnm1;
        // return fn;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your number for factorial:");
        n = sc.nextInt();
        System.out.println("Factorial of number is :" + fact(n));
    }
}
