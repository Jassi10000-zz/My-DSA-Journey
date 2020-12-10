import java.util.Scanner;

public class pattern20 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern20_(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == 0 || j == n - 1) {
                    System.out.print("*\t");
                }else if(i>=n/2 && ( i == j || i+j == n-1)){
                    System.out.print("*\t");
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
        pattern20_(n);
    }
}