import java.util.*;

public class pattern8 {
    public static Scanner sc = new Scanner(System.in);

    public static void pattern8_(int row) {
        int nsp = row - 1;

        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            System.out.println("*\t");
            nsp--;
        }

    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        // write ur code here
        pattern8_(n);

    }
}