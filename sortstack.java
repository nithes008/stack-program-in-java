// File: P04_SortStack.java
import java.util.Stack;

public class P04_SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!inputStack.isEmpty()) {
            int tmp = inputStack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > tmp) {
                inputStack.push(tempStack.pop());
            }
            tempStack.push(tmp);
        }
        return tempStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);
        Stack<Integer> sortedStack = sortStack(stack);
        System.out.println("Sorted Stack: " + sortedStack);
    }
}
