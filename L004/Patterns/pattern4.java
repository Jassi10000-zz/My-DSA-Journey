import java.util.Scanner;

public class pattern4 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern4_(int row) {
        int nsp = 0;
        int nst = row;
        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        pattern4_(n);

    }
}