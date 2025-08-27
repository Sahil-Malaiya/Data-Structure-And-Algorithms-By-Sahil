import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

// Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LevelOrderTraversal {

    // Level Order Traversal (Breadth-First Search)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null); // level separator

        while (!que.isEmpty()) {
            Node currNode = que.remove();

            if (currNode == null) {
                System.out.println(); // new line for next level
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");

                if (currNode.left != null) {
                    que.add(currNode.left);
                }
                if (currNode.right != null) {
                    que.add(currNode.right);
                }
            }
        }
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    // Sample tree creation
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
