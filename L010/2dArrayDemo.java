import java.io.*;
import java.util.*;
import java.util.Scanner;

public class 2dArrayDemo{
public static Scanner sc = new Scanner(System.in);
public static void main(String[] args) throws Exception {
    // write your code here
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int[][] arr = new int[n][m];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
 }

}