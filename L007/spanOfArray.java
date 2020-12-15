import java.util.Scanner;

public class spanOfArray{

    public static Scanner sc = new Scanner(System.in);

    public static int spanOfArray_(int[] arr){

        int maxEl = (int) -1e8;
    int minEl = (int) 1e8;
    for(int el:arr){
        if (el > maxEl) maxEl = el;
        if (el < minEl) minEl = el;
    }
  
    return maxEl - minEl;

    }

    public static void main(String []args){

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(spanOfArray_(arr));
    }
}