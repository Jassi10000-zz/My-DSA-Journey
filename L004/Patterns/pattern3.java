import java.util.Scanner;

public class pattern3 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern3_(int row) {
        int nsp = row - 1;
        int nst = 1;
        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        pattern3_(n);

    }
}