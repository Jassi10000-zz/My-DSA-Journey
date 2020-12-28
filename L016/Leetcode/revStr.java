class Solution {
   
    void reverseRange(char[] arr,int i, int j){
        while(i < j){
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            
            i++;
            j--;
            
        }
    }
    public String reverseStr(String s, int k) {
        
        if(k == 0 || k == 1 || s.length() <= 1) return s;
        
        int i = 0;
        int n = s.length();
        
        char[] arr = s.toCharArray();
        
        while(i < n){
            if( i + k - 1 < n){
                reverseRange(arr,i,i+k-1);
                i += 2*k;
            }
            else{
                reverseRange(arr,i,n-1);
                break;
            }
        }
        return new String(arr);
    }
}