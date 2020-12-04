import java.util.Scanner;

public class pattern2 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern2_(int row) {
        int nst = row;
        for (int r = 1; r <= row; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nst--;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        pattern2_(n);

    }
}