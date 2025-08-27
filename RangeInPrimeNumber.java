import java.util.Scanner;

public class RangeInPrimeNumber {
    public static boolean rprime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Starting number :");
        int Start = sc.nextInt(0);
        System.out.println("Enter Ending Number :");
        int end = sc.nextInt();

        System.out.println(rprime(num));
    }
}
