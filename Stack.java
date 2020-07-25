public class Stack {
    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
        
    }
    
    private Node top;
    private int size = 0;
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public int peek() {
        return top.data;
    }
    
    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }
    
    public int pop() {
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
    public int getSize() {
        return size;
    }
}
