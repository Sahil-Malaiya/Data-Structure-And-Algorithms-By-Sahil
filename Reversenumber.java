import java.util.Scanner;

public class Reversenumber {
    // Method humesha main ke bahar declare hota hy
    public static int rev(int n) {
        int Rev = 0;
        while (n != 0) {
            Rev = Rev * 10 + n % 10; // Main logic of reversing a numerb given
            n = n / 10;
        }
        return Rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number for reverse: ");
        int n = sc.nextInt();
        System.out.println("Tne Number is:" + rev(n));
    }
}