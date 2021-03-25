public class queue {

    protected int[] arr = null;
    protected int capacity = 0;
    protected int elementCount = 0;
    protected int front = 0;
    protected int back = 0;

    // constructors

    protected void initialiseVariables(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        this.elementCount = 0;
        this.front = 0;
        this.back = 0;

    }

    // default constructor
    public queue() {
        initialiseVariables(10);

    }

    // parametrised constructor
    public queue(int size) {
        this.capacity = size;
        initialiseVariables(capacity);
    }

    // Basic Functions

    public int size() {
        return elementCount;
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    public String display() {
        StringBuilder sb = new StringBuilder(); // done to first store all the elements and then print collectively
        for (int i = this.front; i < this.elementCount; i++) {
            int idx = i % this.capacity;
            sb.append(this.arr[idx]);
wdhf
        }
        return sb.toString();

    }

    // Exceptions -----> 1. Overflow Exception ( when stack becomes full and still
    // we are puhsing data )
    // 2. Underflow Exception ( when stack is empty and still we are popping data )

    protected void OverflowException() throws Exception {
        if (this.elementCount == this.capacity)
            throw new Exception("Queue is full");

    }

    protected void UnderflowException() throws Exception {
        if (this.elementCount == 0) {
            throw new Exception("Queue is Empty");
        }
    }

    protected void push_(int data) {
        this.arr[this.back] = data;
        this.elementCount++;
        this.back = (this.back + 1) % this.capacity;

    }

    public void push(int data) throws Exception {
        OverflowException();
        push_(data);
    }

    public int front() throws Exception {
        UnderflowException();
        return this.arr[this.front];
    }

    protected int pop_() {
        int returnValue = this.arr[this.front];
        this.arr[this.front] = 0;

        this.elementCount--;
        this.front = (this.front + 1) % this.capacity;

        return returnValue;

    }

    public int pop() throws Exception {
        UnderflowException();
        return pop_();
    }

}
