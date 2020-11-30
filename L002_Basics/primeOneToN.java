import java.util.Scanner;

public class primeOneToN {

    public static Scanner sc = new Scanner(System.in);

    public static boolean isPrime_(int n) {
        boolean prime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void printAllPrimes(int a, int b) {

        for (int i = a; i <= b; i++) {
            boolean ans = isPrime_(i);

            if (ans)
                System.out.println(i);

        }
    }

    public static void main(String[] args) {

        int low = sc.nextInt();
        int high = sc.nextInt();

        printAllPrimes(low, high);

    }
}
