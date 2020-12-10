import java.util.Scanner;

public class primeFactorization {

    public static Scanner sc = new Scanner(System.in);

    public static void primeFactorization_(int n) {

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }

    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        primeFactorization_(n);
    }

}
