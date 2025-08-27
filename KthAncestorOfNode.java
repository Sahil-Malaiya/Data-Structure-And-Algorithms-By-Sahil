public class KthAncestorOfNode {
    public static int kthancestor(Node root, int n, int k) {
        if (root == null) {
            return 0;
        }
        if (root.data == n) {
            return 0;
        }
        int leftdist = kthancestor(root.left, n, k);
        int rightdist = kthancestor(root.right, n, k);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }
        int max = Math.max(leftdist, rightdist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }
}
