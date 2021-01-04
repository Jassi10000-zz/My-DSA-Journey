// i/p : 10
//       3
//       5 3 7 3 2 3 9 4 3 2

// o/p : 8  (i.e the last idx of 3)

import java.util.Scanner;

public class lastIndex{

    public static Scanner sc = new Scanner(System.in);
    public static int lastIdx_(int[] arr, int idx ,int data){

        if(idx < 0) return -(int)1e9;

        if(arr[idx] == data) return idx;
        else return lastIdx_(arr, idx - 1, data);

    }

    public static void main(String[] args){

        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int data = sc.nextInt();
        System.out.println(lastIdx_(arr , arr.length-1 , data));
    }
}