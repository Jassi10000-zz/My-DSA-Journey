import java.util.Scanner;

public class waveTrav2 {

    public static Scanner sc = new Scanner(System.in);

    public static void waveTrav2_(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < arr[0].length; j++) {
                    System.out.println(arr[i][j] + " ");
                }
            } else {

                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.println(arr[i][j] + " ");
                }

            }
        }

    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        waveTrav2_(arr);
    }
}