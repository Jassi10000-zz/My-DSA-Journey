import java.io.*;
import java.util.*;

public class printZigZag {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n) {
        
        if(n == 0) return;
        
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        

    }

}