import java.util.Scanner;

public class inverseOfNo {

    public static Scanner sc = new Scanner(System.in);

    public static int inverseOfNo_(int n) {

        int origPos = 1;
        int inv = 0;
        while (n != 0) {

            int origDigit = n % 10;

            int invertDigit = origPos;

            int invertPos = origDigit;

            inv = inv + invertDigit * (int) Math.pow(10, invertPos - 1);

            n = n / 10;
            origPos++;

        }

        return inv;
    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        System.out.println("Inverse of the no is " + inverseOfNo_(n));
    }
}