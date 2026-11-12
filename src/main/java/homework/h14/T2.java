import java.util.ArrayDeque;

class MyQueue {
    private ArrayDeque<Integer> inputStack;
    private ArrayDeque<Integer> outputStack;

    public MyQueue() {
        inputStack = new ArrayDeque<>();
        outputStack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        peek();
        return outputStack.pop();
    }
    
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }
    
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
