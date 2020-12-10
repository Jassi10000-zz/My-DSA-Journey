import java.util.Scanner;

public class pattern18 {
    public static Scanner sc = new Scanner(System.in);

    public static void pattern18_(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == j || (i + j == n + 1 && i != j)) {
                    System.out.print("*\t");
                } else if (i == 1) {
                    System.out.print("*\t");
                } else if (i > n / 2 + 1 && j > 1 && j < n) {
                    if (i > j && i + j > n + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();

        pattern18_(n);
    }
}