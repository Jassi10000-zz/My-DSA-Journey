import java.io.*;
import java.util.*;

public class powerLog {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
        int x = sc.nextInt();

        int n = sc.nextInt();

        System.out.println(power(x, n));

    }

    public static int power(int x, int n) {

        if(n == 0) return 1;
        if (n % 2 == 0) return power(x, n / 2) * power(x, n / 2);
        else return x * power(x, n / 2) * power(x, n / 2);
    }

}