import java.util.Scanner;

public class decimalToAnyBase {

    public static Scanner sc = new Scanner(System.in);

    public static int dtab(int n, int a) {

        int sum = 0;
        int p = 1;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;

            sum += r * p;
            p *= a;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        int conB = sc.nextInt();

        dtab(n, conB);
    }
}