import java.util.Scanner;

public class benjaminBulbs {
    public static Scanner sc = new Scanner(System.in);

    public static void benjaminBulbs_(int n) {
        for (int i = 1; i * i < n; i++) {
            System.out.println(i * i);
        }
    }

    public static void main(String[] args) {

        int noOfFluctuations = sc.nextInt();

        benjaminBulbs_(noOfFluctuations);
    }
}
