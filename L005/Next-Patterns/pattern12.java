import java.util.Scanner;

public class pattern12 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern12_(int n) {

        int a=0 , b=1;

        for (int i = 1; i <= n; i++) {
            for (int j= 1; j <=i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        pattern12_(n);
    }
}
