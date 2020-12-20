import java.util.Scanner;

public class waveTrav{

    public static Scanner sc = new Scanner(System.in);

    public static void waveTrav_(int[][] arr) {

        for (int j = 0; j < arr[0].length; j++) {

            if (j % 2 == 0) {

                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j] + " ");
                }
            } else {

                for (int i = arr.length - 1; i >= 0; i--) {
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

        waveTrav_(arr);
    }
}
