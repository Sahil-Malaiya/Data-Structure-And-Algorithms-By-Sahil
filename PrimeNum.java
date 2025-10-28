import java.util.Scanner;

public class PrimeNum {
    public static boolean prime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        System.out.println(prime(num));

        // if (prime(num)) {
        // System.out.println("Number is prime ");
        // } else{
        // System.out.println("Number is Not prime ");
        // }
    }
}
