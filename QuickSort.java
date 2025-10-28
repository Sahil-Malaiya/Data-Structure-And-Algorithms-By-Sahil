public class QuickSort {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int idx = partition(arr, si, ei);
        quickSort(arr, si, idx - 1);
        quickSort(arr, idx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) { // yaha pe galti maat karna j=o nahi hoga j=si hoga
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;// Yaha yaad rakha i ko return karvana hy
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 8, 5, 2, 4, -2 };
        quickSort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
