public class StackImplementationLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class InnerStackImplementationLL {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public static void main(String[] args) {
            InnerStackImplementationLL s = new InnerStackImplementationLL();
            s.push(1);
            s.push(2);
            s.push(3);
            while (!s.isEmpty()) { // Imp Conditionhy isko bhulna maat bhai
                System.out.println(s.peek());
                s.pop();
            }
        }
    }
}
