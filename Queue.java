public class Queue {
    static class InnerQueue {
        static int arr[];
        static int size;
        static int rear;

        InnerQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static void addQueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Empty :");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty :");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Enpty");
                return -1;
            }
            return arr[0];
        }

        public static void main(String[] args) {
            InnerQueue q = new InnerQueue(5);
            q.addQueue(1);
            q.addQueue(2);
            q.addQueue(3);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
