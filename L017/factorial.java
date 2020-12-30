import java.io.*;
import java.util.*;

public class factorial {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = sc.nextInt();

        int x = factorial(n);
        System.out.print(x);

    }

    public static int factorial(int n) {

        return n == 0 ? 1 : n * factorial(n - 1);


    }

}