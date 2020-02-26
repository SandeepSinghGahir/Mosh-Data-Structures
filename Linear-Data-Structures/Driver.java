package linear_data_structures;

public class Driver {

    public static void main(String[] args) {
//
//        double res = (double) 10 / (double) 3;
//        System.out.println( 6 - 10/3);

//        linear_data_structures.HashMap map = new linear_data_structures.HashMap();
//
//        map.put(3,"A");
//        map.put(2,"B");
//        map.put(5,"C");
//        System.out.println(map.get(5));
//        map.remove(5);
//        System.out.println(map.get(5));
//        map.put(5,"D");
//        System.out.println(map.get(5));
//        map.remove(25);

  /*linear_data_structures.Array numbers = new linear_data_structures.Array(4);
  numbers.insert(10);
  numbers.insert(20);
  numbers.insert(30);
  numbers.insert(40);
  numbers.insert(50);
  numbers.insert(60);
  numbers.insert(70);
  numbers.insert(80);
  numbers.insert(70);
  numbers.print();
  numbers.removeAt(1);
  numbers.print();
  System.out.println(numbers.indexOf(50));*/


 /* linear_data_structures.LinkedList list = new linear_data_structures.LinkedList();
      list.addFirst(10);
      list.addFirst(20);
      list.addFirst(30);
      list.addLast(40);
  //list.print();
  //list.deleteFirst();
//  list.print();
  //list.deleteLast();
  //list.deleteLast();
  //System.out.println(list.indexOf(400));
  //list.print();
      //

      System.out.println( Arrays.toString(list.toArray()));
      System.out.println(list.getNodeBeforeKthNode(0));
      //list.reverse();
      //System.out.println( Arrays.toString(list.toArray()));
  //var array = list.toArray();
  //System.out.println( Arrays.toString(array));
  //System.out.println(list.size());

*/
/*
        linear_data_structures.StringReverser reverser = new linear_data_structures.StringReverser();
        //System.out.println(reverser.getStringReversed(null));
        //System.out.println(reverser.getStringReversed( "Hello Sandeep"));
        //System.out.println(new linear_data_structures.BalancedExpressionsStack().checkIfBracketsAreBalanced("(<5+2> < +  {6/3}> - {2-8})"));
        linear_data_structures.Stack stack = new linear_data_structures.Stack(4);
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.print();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.push( 121 );
        stack.print();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.print();
        System.out.println(stack.isEmpty());
        //stack.pop();
        System.out.println(3%3);
        System.out.println(0%3);*/
/*
        linear_data_structures.ArrayQueue queue = new linear_data_structures.ArrayQueue( 4);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enqueue( 10 );
        queue.enqueue( 20 );
        queue.enqueue( 30 );
        queue.enqueue( 40 );
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
        queue.enqueue( 60 );
        queue.enqueue( 70 );
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
        queue.enqueue(80);
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());*/

        PriorityQueue priorityQueue = new PriorityQueue( 5 );
        priorityQueue.enqueue( 10 );
        priorityQueue.enqueue( 30 );

        priorityQueue.enqueue( 50 );

        priorityQueue.enqueue( 20 );

        priorityQueue.enqueue( 40 );

        priorityQueue.dequeue();
        priorityQueue.dequeue();
        priorityQueue.dequeue();

        priorityQueue.enqueue( 80 );
        System.out.println(priorityQueue.toString());

        priorityQueue.enqueue( 90 );
        System.out.println(priorityQueue.toString());


        priorityQueue.dequeue();
        System.out.println(priorityQueue.toString());

        priorityQueue.enqueue( 60 );
        System.out.println(priorityQueue.toString());


        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.toString());

        System.out.println(priorityQueue.dequeue());

        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        priorityQueue.enqueue(10);
        System.out.println(priorityQueue.toString());





        //priorityQueue.print();


    }
}
