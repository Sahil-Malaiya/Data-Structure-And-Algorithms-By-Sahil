public class RemoveDuplicateStringRecursion {
    public static void removeDuplicate(String str, int index, StringBuilder newstr, boolean map[]) {
        // Base case
        if (index == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        if (map[currchar - 'a'] == true) {
            removeDuplicate(str, index + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDuplicate(str, index + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
