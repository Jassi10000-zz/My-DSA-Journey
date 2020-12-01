import java.util.Scanner;

public class rotateANoByR {

    public static Scanner sc = new Scanner(System.in);

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int rotateNo(int n, int r) {
        int len = countDigits(n);
        r %= len;
        if (r < 0)
            r = (r + len) % len;

        int mul = 1, div = 1;
        for (int i = 1; i <= len; i++) {
            if (i <= r)
                div *= 10;
            else
                mul *= 10;
        }

        int a = n % div;
        int b = n / div;

        return a * mul + b;

    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        int r = sc.nextInt();

        System.out.println(rotateNo(n, r));

    }
}