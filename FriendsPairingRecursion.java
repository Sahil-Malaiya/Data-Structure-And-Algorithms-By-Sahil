import java.util.Scanner;

public class FriendsPairingRecursion {
    public static int friendsPairingRecursion(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // kaam //choice
        int single = friendsPairingRecursion(n - 1);

        int pair = friendsPairingRecursion(n - 2);
        int pair4 = (n - 1) * pair;

        int totalways = single + pair4;

        return totalways;
        // return friendsPairingRecursion(n - 1) + (n - 1) * friendsPairingRecursion(n -
        // 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n = sc.nextInt();
        System.out.println(friendsPairingRecursion(n));
    }
}
