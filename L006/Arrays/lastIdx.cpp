private static int lastIndex(int[] arr, int target){
        int idx = -1;

        for(int i=arr.length - 1; i  >= 0; i--){
            if ( arr[i] == target) {
                idx= i;
                break;
            }
        }


        return idx;
    }