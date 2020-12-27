import java.util.Scanner;
import java.util.Arrays;

public class reverseArr{

    public static Scanner sc = new Scanner(System.in);
    

    public static void reverseArr_(int[] arr){

        int i=0;
        int j=arr.length - 1;

        while(i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int ele:arr){
            System.out.println(ele);
        }
    }

    public static void main(String[] args){

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArr_(arr);
    }
}