public class KthLevelOfTree {
    public static void kthleveltree(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.println(root.data + " ");
            return;
        }
        kthleveltree(root.left, level + 1, k);
        kthleveltree(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int k = 2;
        kthleveltree(root, 1, k);
    }
}
