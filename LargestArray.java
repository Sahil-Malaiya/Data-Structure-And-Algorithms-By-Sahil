public class LargestArray {
    public static int largeArray(int arr[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 4, 5 };
        System.out.println("The largest is :" + largeArray(arr));
    }
}
