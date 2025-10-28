import java.util.Scanner;

public class Strings {
    public static void allchar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        // String str1 = new String("Sahil");

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        allchar(str);
    }
}
