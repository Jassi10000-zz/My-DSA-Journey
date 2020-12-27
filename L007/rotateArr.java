import java.io.*;
import java.util.*;

public class rotateArr {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] arr,int i,int j){

        int li = i;
        int ri = j;
    
        while(li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
    
            li++;
            ri--;
        }
    }
    
    public static void rotate(int[] arr, int k) {
         k = (k%arr.length + arr.length)%arr.length;
        
    
        reverse(arr,0,arr.length - k -1);
        reverse(arr,arr.length - k,arr.length-1) ;
        reverse(arr,0,arr.length-1);
        
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}