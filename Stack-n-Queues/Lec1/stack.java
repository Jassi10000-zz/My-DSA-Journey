public class stack {
    protected int[] arr = null;
    protected int capacity = 0;
    protected int elementCount = 0;
    protected int tos = -1; // tos ---> top of the stack

    // constructors

    protected void initialiseVariables(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        // we have initialised these two already but here also its very necessary
        this.elementCount = 0;
        this.tos = -1;

    }

    // default constructor
    public stack() {
        initialiseVariables(10);

    }

    // parametrised constructor
    public stack(int size) {
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

    // Exceptions -----> 1. Overflow Exception ( when stack becomes full and still
    // we are puhsing data )
    // 2. Underflow Exception ( when stack is empty and still we are popping data )

    protected void OverflowException() throws Exception {
        if (this.elementCount == capacity)
            throw new Exception("Stack is full");

    }

    protected void UnderflowException() throws Exception {
        if (this.elementCount == 0) {
            throw new Exception("Stack is Empty");
        }
    }

    protected void push_(int data) {
        this.arr[++tos] = data;
        this.elementCount++;
    }

    public void push(int data) throws Exception {
        OverflowException();
        push_(data);
    }

    public int top() throws Exception {
        UnderflowException();
        return this.arr[this.tos];
    }

    protected int pop_() {
        int returnValue = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.elementCount--;
        return returnValue;

    }

    public int pop() throws Exception {
        UnderflowException();
        return pop_();
    }

}
