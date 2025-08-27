public class SortedArrayByResursion {
    public static boolean sortedN(int n[], int i) {
        if (i == n.length - 1) {
            return true;
        }
        if (n[i] > n[i + 1]) {
            return false;
        }
        return sortedN(n, i + 1);
    }

    public static int firstoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccurence(arr, key, i + 1);
    }

    public static int lastoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastoccurence(arr, key, i + 1);
        // if (isFound != -1) {
        // return isFound;
        // }
        // if (arr[i] == key) {
        // return i;
        // }
        // Or
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(sortedN(n, 0));
        System.out.println(lastoccurence(arr, 5, 0));
    }
}
