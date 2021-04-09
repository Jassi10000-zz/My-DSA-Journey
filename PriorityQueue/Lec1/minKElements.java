import java.io.*;
import java.util.*;
import java.util.Scanner;

public class minKElements {

    public static Scanner sc = new Scanner(System.in);

    public static void operation(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        for (int ele : arr) {
            pq.add(ele);
            while (pq.size() > k) {
                pq.remove();
            }

        }

        while (pq.size() != 0) {
            System.out.print(pq.remove() + "  ");
        }
    }

    public static void main(String[] args) throws Exception {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        // write your code here

        operation(arr, k);
    }

}