public class LinearSearchArray {
    public static int linearSearchArray(int num[], int key) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int index = linearSearchArray(num, key);
        // for (int i = 0; i < num.length; i++) {
        if (index == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("Key found at index at :" + index);
        }
    }
}
// }
