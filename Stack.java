public class Stack {
    private int maxSize;
    private int top;
    private int[] array;
 
    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        array = new int[maxSize];
        top = -1; // Stack is initially empty
    }
 
    // Push operation
    public void push(int value) {
        if (top < maxSize - 1) {
            array[++top] = value;
            System.out.println(value + " pushed onto the stack.");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }
 
    // Pop operation
    public int pop() {
        if (top >= 0) {
            int poppedValue = array[top--];
            System.out.println(poppedValue + " popped from the stack.");
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // You can choose an appropriate value to indicate an empty stack
        }
    }
 
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack with a maximum size of 5
 
        stack.push(10);
        stack.push(20);
        stack.push(30);
 
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
    }
}