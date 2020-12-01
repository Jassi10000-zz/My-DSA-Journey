import java.util.Scanner;

public class fibTillN {

    public static Scanner sc = new Scanner(System.in);

    public static void fibTillN_(int n) {
        int a = 0, b = 1;
        if (n < 1)
            return;
        System.out.println(a + " ");

        for (int i = 1; i < n; i++) {
            System.out.println(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        fibTillN_(n);

    }
}