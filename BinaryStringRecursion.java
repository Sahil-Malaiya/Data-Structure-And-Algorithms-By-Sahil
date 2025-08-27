public class BinaryStringRecursion {
    public static void binarystring(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binarystring(n - 1, 0, str + '0');
        if (lastplace == 0) {
            binarystring(n - 1, 1, str + '1');
        }

    }

    public static void main(String[] args) {
        binarystring(3, 0, "");
    }
}
