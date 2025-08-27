import java.util.Scanner;

public class BitManipulationEvenOrOdd {
    public static void evenodd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int getithBits(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithBits(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearithBits(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBits(int n, int i, int newBits) {
        if (newBits == 0) {
            return clearithBits(n, i);
        } else {
            return setithBits(n, i);
        }
    }

    public static int clearLastBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExponentation(int a, int power) {
        int ans = 1;
        while (a > 0) {
            if ((power & 1) != 0) {
                ans *= a;
            }
            a *= a;
            power >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // evenodd(n);
        System.out.println(getithBits(10, 2));
        System.out.println(setithBits(10, 2));
        System.out.println(clearithBits(10, 1));
        System.out.println(updateIthBits(10, 1, 0));
        System.out.println(clearLastBits(15, 2));
        System.out.println(countBits(16));
        System.out.println(fastExponentation(5, 3));
    }
}
