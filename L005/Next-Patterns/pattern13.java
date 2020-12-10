import java.util.Scanner;

public class pattern13 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern13_(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int a = (int)Math.pow(11,j);
                System.out.print(a + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        pattern13_(n);
    }
}