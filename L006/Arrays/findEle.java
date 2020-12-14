import java.util.Scanner;
import java.util.Arrays;

public class findEle{

    public static Scanner sc = new Scanner(System.in);

    public static int findEle_(int[] arr, int x){
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
              idx = i;
              break;
            } 
            return idx;
        }    
    }
  
    public static void main(String[] args){

        int n =  sc.nextInt();
       
        int[] arr = new int[n];


        for(int i=0;i<arr.length;i++)
        {   
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        System.out.println(findEle_(arr,d));

    }
}