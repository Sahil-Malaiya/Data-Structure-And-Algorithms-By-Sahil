public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = null;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " < - >");
                temp = temp.next;
            }
            System.out.println();
        }

        public int removeFirst() {
            if (head == null) {
                System.out.println("Doublly Linked list isn empty : ");
                return Integer.MIN_VALUE;
            }
            if (size == 1) {
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }
    }

    public static void main(String[] args) {
        LinkdeList ll = new LinkdeList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
    }
}
