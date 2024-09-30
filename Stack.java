/**
 * A simple stack program using an array of integers.
 * Uses the standard stack operations (push, pop, peek, size, and isEmpty.)
 */
public class Stack {
    private final int[] stack;
    private int top; // Points to the next available index for push operation
    public Stack() {
        stack = new int[10];
        top = 0;
    }
    // Pushes an element on the top of the stack
    public void push(int element) {
        if (top == stack.length) {
            throw new RuntimeException("Full stack!");
        }
        stack[top++] = element;
    }
    // Removes and returns the top of the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        return stack[--top];
    }
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        return stack[top - 1];
    }
    // Return the number of elements in the stack
    public int size() {
        return top;
    }
    // Return true if the stack is empty or set false otherwise
    public boolean isEmpty() {
        return top == 0;
    }
}