// File: P08_InterleaveQueue.java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P08_InterleaveQueue {
    public static void interleave(Queue<Integer> q) {
        if (q.size() % 2 != 0) return;

        Stack<Integer> s = new Stack<>();
        int halfSize = q.size() / 2;

        for (int i = 0; i < halfSize; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < halfSize; i++) {
            q.add(q.remove());
        }
        for (int i = 0; i < halfSize; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11); q.add(12); q.add(13); q.add(14);
        q.add(15); q.add(16); q.add(17); q.add(18);

        interleave(q);
        System.out.println("Interleaved Queue: " + q);
    }
}
