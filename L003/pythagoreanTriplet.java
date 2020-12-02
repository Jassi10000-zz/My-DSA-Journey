import java.util.Scanner;

public class pythagoreanTriplet{

    public static Scanner sc = new Scanner(System.in);

    public static boolean checkPythTrip(int a, int b, int c) {
        if (a > b && a > c) {
            if (a * a == b * b + c * c) {
                return true;
            }
        } else if (b > a && b > c) {
            if (b * b == a * a + c * c) {
                return true;
            }
        } else {
            if (c * c == b * b + a * a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String []args) {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean ans = checkPythTrip(a, b, c);
        if (ans)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
