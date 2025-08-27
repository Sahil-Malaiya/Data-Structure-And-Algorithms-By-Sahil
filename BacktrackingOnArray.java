public class BacktrackingOnArray {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void backtrack(int arr[], int i, int val) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = val;
        backtrack(arr, i + 1, val + 1); // yaha bhula tha ye yaad rakhna
        arr[i] = arr[i] - 2; // backtracking , ye humesha fun call ke baad hi hogi
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backtrack(arr, 0, 1);
        printArr(arr);
    }
}
