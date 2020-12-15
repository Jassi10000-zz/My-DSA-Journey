private static int minElement(int[] arr){
        int minEl = (int) 1e8;

        for(int el: arr){
            if(el < minEl) minEl = el;
        }

        return minEl;
    }


     //  public int minElement(int arr[]){
    //     int minEle = -1e8;
    //     for(int i=0;i<arr.length;i++){
    //         if(a[i]<minEle)
    //          minEle = a[i]; 
    //     }
    //     return minEle;
    // }