public class Queue {
    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node head;
    private Node tail;
    private int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.data;
    }

    public void add(int data) {
        
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;

        }
        tail = node;

        if(head == null) {
            head = node;
        }
        size++;

    }

    public int remove() {
        int data = head.data;
        
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }
    
    public int getSize() {
        return size;
    }
}
