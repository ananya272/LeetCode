import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsing2Queues {
    private Queue<Integer> q1; // Main queue
    private Queue<Integer> q2; // Temporary queue

    public StackUsing2Queues() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        // Add new element to q2
        q2.add(x);
        
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        
        // Swap q1 and q2 to make q1 the main queue
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (empty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove(); // Remove the front element of q1
    }

    public int top() {
        if (empty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek(); // Peek at the front element of q1
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
