public class TraansformToSumOfTrees {
    public static int transformSum(Node root) {
        int leftChild = transformSum(root.left);
        int rightChild = transformSum(root.right);

        int data = root.data;
        root.data = leftChild + root.left.data + rightChild + root.right.data;
        return data;
    }
}
