import java.io.*;
import java.util.*;

public class printDec {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
        int n = sc.nextInt();

        printDecreasing(n);
    }

    public static void printDecreasing(int n) {

        if (n == 0) return;

        System.out.println(n);
        printDecreasing(n - 1);

    }

}