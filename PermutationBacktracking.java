public class PermutationBacktracking {
    public static void permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // main logic substring le rahe hy aur i ko nahi le rahe matlab jo yek baar le
            // liya uko nahi lena hy jaise a ho gaya to vo nahi b lo
            String Newstr = str.substring(0, i) + str.substring(i + 1); // yaha par yaad rakhna ayar str
            // backtracking ke liye function call karna hota hy
            permutation(Newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
