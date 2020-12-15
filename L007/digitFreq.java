import java.util.Scanner;

public class digitFreq {
    public static Scanner sc = new Scanner(System.in);

    public static int digitFreq_(long n, int a) {

        int count = 0;

        int temp = (int) n;
        while (temp != 0) {

            int r = temp % 10;

            if (r == a) {

                count++;
            }
            temp = temp / 10;
        }

        return count;

    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(digitFreq_(n, d));
    }

}
