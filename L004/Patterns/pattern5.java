import java.util.Scanner;

public class pattern5 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern5_(int row) {
        int nsp = row / 2;
        int nst = 1;
        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= row / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        pattern5_(n);

    }
}