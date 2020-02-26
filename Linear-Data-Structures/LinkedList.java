package linear_data_structures;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int value) {

        Node item = new Node( value );

        if (first == null) {
            first = last = item;
            size++;
            return;
        }
        item.next = first;
        first = item;
        size++;

    }

    public void addLast(int value) {
        Node item = new Node( value );
        if (first == null) {
            first = last = item;
            size++;
            return;
        }
        last.next = item;
        last = item;
        size++;
    }

    public void deleteFirst() {
        if (first == null)
            throw new IllegalStateException();
        if (first == last) {
            first = last = null;
            return;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
    }

    public void deleteLast() {
        if (first == null)
            throw new IllegalStateException();
        ;
        if (first == last) {
            first = last = null;
            return;
        }
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        last = temp;
    }

    public int indexOf(int value) {
        Node temp = first;
        int count = 0;
        while (temp != null) {
            if (temp.value == value)
                return count;
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public boolean contains(int value) {
        Node temp = first;
        while (temp != null) {
            if (temp.value == value)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.print( temp.value + " " );
            temp = temp.next;
        }
    }

    public int[] toArray() {
        int[] array = new int[this.size];
        Node temp = this.first;
        int index = 0;
        while (temp != null) {
            array[index++] = temp.value;
            temp = temp.next;
        }
        return array;
    }

    public int size() {
        return this.size;
    }

    public void reverse() {
        if (first == last)
            return;
        Node current = first.next;
        Node previous = first;
        Node temp;
        while (current != null) {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        first.next=null;
        last = first;
        first = previous;
    }

    public int getNodeBeforeKthNode(int index){
        if(first==null)
            throw new IllegalStateException();

        Node fast = first;
        Node slow = first;
        int i=1;
        while(index>i){
            fast = fast.next;
            if(fast==null)
                throw new IllegalArgumentException();
            i++;
        }
        while(fast!=last){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.value;
    }
}


