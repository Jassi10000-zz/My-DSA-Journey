import java.util.Scanner;

public class maxOfArr {

    public static Scanner sc = new Scanner(System.in);
    public static int maxArr(int[] arr, int idx) {

        if (idx == arr.length) return -1;

        int maxEle = maxArr(arr, idx + 1);
        return Math.max(arr[idx], maxEle);


    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(maxArr(arr, 0));
    }
}