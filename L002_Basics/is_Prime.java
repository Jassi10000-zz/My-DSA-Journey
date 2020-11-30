import java.util.Scanner;

public static class is_Prime {
    public static Scanner scn = new Scanner(System.in);

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

    public static void isPrime(int n) {

        boolean ans = isPrime_(n);
        if (ans)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

    public static void main(String[] args) {

        int t = scn.nextInt();

        while (t-- > 0) {
            int n = scn.nextInt();
            isPrime(n);
        }
    }
}