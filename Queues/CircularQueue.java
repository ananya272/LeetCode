public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear +1)% size == front;
        }

        // Add O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            //add 1st element
            if(front== -1){
                front = 0;
            }
            rear = (rear + 1)% size;
            arr[rear] = data;
        }

        // Remove O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            
            int result = arr[front];
            
            //last el delete
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1)%size;
            }
            return result;
        }

        // Peek O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }
    }

}
