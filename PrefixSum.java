public class PrefixSum {
    public static void prefix(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                // for (int k = start; k <= end; k++) { // iska kaam hy srif print karvana
                // System.out.println(arr[k]);
                // }
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Max Sum is :" + maxSum);
    }

    public static void kadanes(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max is :" + ms);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        // prefix(arr);
        kadanes(arr);
    }
}
