public class MergeSortLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Add element at start of LL
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print the Linked List
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Find middle node
    public Node midNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted LLs
    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // Dummy node
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Remaining nodes
        if (head1 != null)
            temp.next = head1;
        if (head2 != null)
            temp.next = head2;

        return mergedLL.next;
    }

    // Merge Sort on LL
    public Node mergeSort(Node head) {
        // Base Case Correction
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = midNode(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSortLinkedList ll = new MergeSortLinkedList();

        ll.addFirst(1);
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(6);

        System.out.println("Original Linked List:");
        ll.print();

        head = ll.mergeSort(head);

        System.out.println("Sorted Linked List:");
        ll.print();
    }
}
