import java.util.Scanner;

public class decimalToAnyBase {

    public static Scanner sc = new Scanner(System.in);

    public static int dtab(int n, int a) {

        int sum = 0;
        int p = 1;
        while (n != 0) {
            int r = n % a;
            n = n / a;

            sum += r * p;
            p *= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        int conB = sc.nextInt();

        dtab(n, conB);
    }
}