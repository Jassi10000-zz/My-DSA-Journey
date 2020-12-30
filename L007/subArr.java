import java.util.Scanner;
import java.util.Arrays;
public class Main{

    public static Scanner sc = new Scanner(System.in);
    public static void subArr_(int[] arr){

        //starting point
        for(int i=0;i<arr.length;i++){
            //ending point
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){

        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        subArr_(arr);

    }
}