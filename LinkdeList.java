public class LinkdeList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tails;
    public static int size;

    public void addFirst(int data) {
        // Creating a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tails = newNode;
            return;
        }
        // Newnode Next head
        newNode.next = head;

        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tails = newNode;
            return;
        }
        tails.next = newNode;
        tails = newNode;
    }

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
        System.out.println("Null");
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (idx < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tails = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void deleteN(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            return;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = size - 1;
        Node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node slowfast(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindorme() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = slowfast(head);
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkdeList ll = new LinkdeList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.itrSearch(3));

    }

    public void rever() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rever'");
    }
}
