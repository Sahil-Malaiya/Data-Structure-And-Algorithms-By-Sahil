public class TrimABinaryTree {
    public static Node trimbt(Node root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.data < low) {
            return trimbt(root.right, low, high);
        } else if (root.data > high) {
            return trimbt(root.right, low, high);
        } else {
            root.left = trimbt(root.left, low, high);
            root.right = trimbt(root.right, low, high);
            return root;
        }
    }

    public static void main(String[] args) {

    }
}
