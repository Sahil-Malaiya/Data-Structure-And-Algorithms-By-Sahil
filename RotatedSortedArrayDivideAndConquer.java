public class RotatedSortedArrayDivideAndConquer {
    public static int indexofarray(int arr[], int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // mid on l1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return indexofarray(arr, target, si, mid - 1);
            } else {
                return indexofarray(arr, target, mid + 1, ei);
            }
        }

        // mid on l2
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return indexofarray(arr, target, mid + 1, ei);
            } else {
                return indexofarray(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        int taridx = indexofarray(arr, target, 0, arr.length - 1);
        System.out.println(taridx);
    }
}
