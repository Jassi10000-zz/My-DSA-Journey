public static int[] solve(int[] arr){
   
   
    LinkedList<Integer> st = new LinkedList<>();
    int n = arr.length;
    int[] ans = new int[n];
    Arrays.fill(ans,-1);
    
    for(int i=n;i>=0;i--){
        while(st.size()!=0 && arr[st.getFirst()] > arr[i]){
            ans[st.removeFirst()] = arr[i];
            
        }
        st.addFirst(i);
    }
    return ans;
  }
 