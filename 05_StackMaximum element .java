// File: P03_StackMinimum.java
import java.util.Stack;

public class P03_StackMinimum {
    static class MinStack {
        private Stack<Integer> mainStack = new Stack<>();
        private Stack<Integer> minStack = new Stack<>();

        public void push(int val) {
            mainStack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public int pop() {
            int val = mainStack.pop();
            if (val == minStack.peek()) {
                minStack.pop();
            }
            return val;
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.push(15);
        stack.push(16);

        System.out.println("Minimum element: " + stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println("Minimum element after pops: " + stack.getMin());
    }
}
