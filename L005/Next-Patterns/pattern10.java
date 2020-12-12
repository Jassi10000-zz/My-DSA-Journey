import java.util.Scanner;

public class pattern10 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern10_(int n) {

        int outSp = n / 2;

        int inSp = -1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= outSp; j++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int j = 1; j <= inSp; j++) {
                System.out.print("\t");
            }

            if (i > 1 && i < n) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {

                outSp--;

                inSp += 2;
            }

            else {

                outSp++;

                inSp -= 2;

            }

            System.out.println();
        }
    }


    public static void main(String []args){

        int n = sc.nextInt();

        pattern10_(n);
    }

}
