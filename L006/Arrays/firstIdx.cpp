private static int firstIndex(int[] arr, int target){
        
        int idx = -1;

        for(int i=0; i < arr.length; i++){
            if ( arr[i] == target) {
                idx= i;
                break;
            }
        }


        return idx;
    }   
