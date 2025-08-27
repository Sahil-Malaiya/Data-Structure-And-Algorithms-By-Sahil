public class powx2 {
    public static int pow(int x, int n) {
        if (n == 0)
            return 1;
        return x * pow(x, (n - 1));
    }

    public static int optimizedPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfp = optimizedPow(x, n / 2);
        int halfpow = halfp * halfp;
        // int halfpow = optimizedPow(x, n / 2) * optimizedPow(x, n / 2); //isko likhna
        // ke dusra tarika jisme O[logn] ho jayega
        if (n % 2 == 1) {
            halfpow = x * halfpow;
        }
        return halfpow;
    }

    public static void main(String[] args) {
        // System.out.println(pow(5, 50));
        System.out.println(optimizedPow(5, 50));
    }
}
