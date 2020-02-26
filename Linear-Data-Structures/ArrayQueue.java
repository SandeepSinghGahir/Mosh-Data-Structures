package linear_data_structures;

import com.sun.source.tree.CompilationUnitTree;

import java.util.Arrays;

public class ArrayQueue {

private int [] queue;
private int front=-1;
private int rear=-1;
private int count;


public ArrayQueue(int size){
    queue = new int[size];
}

public boolean isEmpty(){
    return count==0;
}

public boolean isFull(){
    return count==queue.length;
}

public void enqueue(int item){
    if(isEmpty()){
        queue[++front]=item;
        rear = front;
        count++;
        return;
    }
    if(isFull()){
        int[] newQueue = new int[2*queue.length];
        newQueue = Arrays.copyOfRange(queue,0,queue.length-1);
        rear = queue.length-1;
        queue = newQueue;
    }
    queue[++rear%queue.length] = item;
    count++;
}

public int dequeue(){
    if(isEmpty())
        throw new IllegalStateException();
    count--;
    int item = queue[front];
    queue[front]=0;
    front = ++front%queue.length;
    return item;
}

public int peek(){
    if(isEmpty())
        throw new IllegalStateException();
    return queue[front];
}

@Override
public String toString(){
    return Arrays.toString( queue );
}

}
