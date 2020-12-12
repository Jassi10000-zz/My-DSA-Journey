import java.util.Scanner;

public class pattern14 {

    public static Scanner sc = new Scanner(System.in);

    public static void pattern14_(int x) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }

    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        pattern14_(n);

    }
}
