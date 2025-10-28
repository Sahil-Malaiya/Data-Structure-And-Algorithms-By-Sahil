public class ReverseArray {
    public static void revarr(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 10 };
        revarr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}