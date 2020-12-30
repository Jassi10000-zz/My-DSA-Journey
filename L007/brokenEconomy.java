// this is actuallu the program of ceil nd floor

import java.io.*;
import java.util.*;

public class brokenEconomy {
    public static Scanner sc = new Scanner(System.in);

    public static void money(int[] arr, int d) {

        int li = 0;

        int ri = arr.length - 1;

        int ceil = 0;
        int floor = 0;
        while (li <= ri) {

            int mid = (li + ri) / 2;

            if (d < arr[mid]) {
                ri = mid - 1;
                ceil = arr[mid];
            } else if (d > arr[mid]) {
                li = mid + 1;
                floor = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        money(arr, d);
    }

}