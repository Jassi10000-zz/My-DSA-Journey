public class stack {

    public class Node {
        int data = 0;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int elementCount = 0;

    public int size() {
        return this.elementCount;
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data);

        if (this.elementCount == 0) {
            this.head = this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public int getFirst() {

        return this.head.data;
    }

    public int removeFirst() {
        Node removeValue = this.head;

        if (this.elementCount == 1) {
            this.head = this.tail = null;
        } else {
            this.head = removeValue.next;
        }

        removeValue.next = null;
        this.elementCount--;

        return removeValue.data;
    }

    // basic functions
    public void push(int data) {
        addFirst(data);
    }

    public int top() {
        return getFirst();
    }

    public int pop() {
        return removeFirst();
    }

}