public class PairsArray {
    public static void pairarr(int pair[]) {
        for (int i = 0; i < pair.length; i++) {
            int curr = pair[i]; // 2 4 6 8 10
            for (int j = i + 1; j < pair.length; j++) {
                System.out.println("(" + curr + "," + pair[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int pair[] = { 2, 4, 6, 8, 10 };
        pairarr(pair);
    }
}
