// This program is the second part of getCommanElements1 as it was based on finding the intersection
// of two arrays

import java.util.HashMap;
import java.util.Scanner;

public class intersectionWithDuplicates {
    public static Scanner sc = new Scanner(System.in);

    public static void gce1(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr1) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (int ele : arr2) {
            if (map.containsKey(ele)) {
                System.out.println(ele);
                map.put(ele, map.get(ele) - 1);
                if (map.get(ele) == 0)
                    map.remove(ele);
            }
        }
    }

    public static void main(String[] args) {

        // this program can also be called as intersection of two array without
        // duplicacy
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        gce1(arr1, arr2);

        // btw if you need to know how to do union of two arrays , then simply add them
    }
}