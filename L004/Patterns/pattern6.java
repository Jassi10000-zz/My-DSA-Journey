import java.util.Scanner;

public class pattern6 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern6_(int row) {
        int nsp = 1;
        int nst = row / 2 + 1;
        for (int r = 1; r <= row; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            if (r <= row / 2) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        pattern6_(n);

    }
}