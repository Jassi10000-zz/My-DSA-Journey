// i/p : 10
//       3
//       5 3 7 3 2 3 9 4 3 2

// o/p : 1  (i.e the first idx of 3)

import java.util.Scanner;

public class firstIdx{

    public static Scanner sc = new Scanner(System.in);
    public static int firIdx(int[] arr, int idx ,int data){

        if(idx == arr.length) return -(int)1e9;

        if(arr[idx] == data) return idx;
        else return firIdx(arr, idx + 1, data);

    }

    public static void main(String[] args){

        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int data = sc.nextInt();
        System.out.println(firIdx(arr , 0 , data));
    }
}