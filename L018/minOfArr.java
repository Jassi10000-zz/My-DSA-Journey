import java.util.Scanner;

public class minOfArr {

    public static Scanner sc = new Scanner(System.in);
    public static int minArr(int[] arr, int idx) {

        if (idx == arr.length) return (int)1e9;

        int minEle = minArr(arr, idx + 1);
        return Math.min(arr[idx], minEle);


    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(minArr(arr, 0));
    }
}