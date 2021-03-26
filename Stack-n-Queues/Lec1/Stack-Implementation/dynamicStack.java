public class dynamicStack extends stack {

    // constructors
    public dynamicStack() {
        super();
    }

    public dynamicStack(int size) {
        super();
    }

    public dynamicStack(int[] arr) {

        super.initialiseVariables(2 * arr.length);

        for (int ele : arr) {
            super.push_(ele);
        }

    }

    @Override
    public void push(int data) {
        if (super.capacity == super.elementCount) {
            int[] temp = super.arr;
            super.initialiseVariables(2 * super.capacity); // agr array full hogya toh size ko double krdo
            for (int ele : temp)
                super.push_(ele); // this is not a recursive call , rather a reference to parent's push method

        }
        super.push(data); // after incrasing the size we now call the parent push method
    }

}