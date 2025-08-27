public class TowerOfHanoiRecursion {
    public static void towerofhanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transfer from : " + n + " " + source + " to" + destination);

            return;
        }
        towerofhanoi(n - 1, source, destination, helper);
        System.out.println("Transfer from : " + n + " " + source + " to" + " " + destination);
        towerofhanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        towerofhanoi(2, "S", "H", "D");
    }
}
