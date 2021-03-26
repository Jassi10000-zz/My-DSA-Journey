public class dynamicQueue extends queue{
    
    // constructors
    public dynamicQueue(){
        super();
    }

    public dynamicQueue(int size){
        super(size);
    }

    //This is one of the constructor where an array is passed and it has to be converted to queue
    public dynamicQueue(int[] arr){
        super(2 * arr.length);
        for(int ele : arr) super.push_(ele); // we have called push_ as it doesn't throw any exception

    }

    @Override
    public void push(int data) throws Exception{
        if( super.capacity == super.elementCount ){
            int n  = super.capacity;
            int f = super.front;

            int[] temp = new int[n];

            // now we have to copy the data into temp  array
            for( int i = 0 ; i < n ; i++){
                int idx = (f+i)%n;
                temp[i] = super.arr[idx];
            }

            super.initialiseVariables(2 * n);
            for(int ele : temp ){
                super.push_(ele);
            }
        }
        super.push_(data);
    }


}