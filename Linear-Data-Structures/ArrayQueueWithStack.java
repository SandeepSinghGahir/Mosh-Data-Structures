package linear_data_structures;

import java.util.Stack;

public class ArrayQueueWithStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // s1- [10,20,30,40]
    // s2 - []

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return stack2.pop();
    }

    public boolean isEmpty(){
        return (stack1.isEmpty() && stack2.isEmpty());
    }


    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.empty())
            while (!stack1.isEmpty())
                stack2.push( stack1.pop() );
    }

}