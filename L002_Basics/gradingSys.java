
import java.util.Scanner;

public class gradingSys {

    public static Scanner scn = new Scanner(System.in);

    public static void gradingSystem(int n) {
        if (n > 90) {
            System.out.println("excellent");
        } else if (n > 80) {
            System.out.println("good");
        } else if (n > 70) {
            System.out.println("fair");
        } else if (n > 60) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }

    }

    public static void main(String[] args) {

        int marks = scn.nextInt();
        gradingSystem(marks);
    }

}