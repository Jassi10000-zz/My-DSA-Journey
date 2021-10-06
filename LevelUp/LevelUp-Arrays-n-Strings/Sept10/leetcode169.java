import java.io.*;
import java.util.Scanner;

public class leetcode169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        majEleBrute(nums);
        majEleBetter(nums);
        majEleOptimal(nums);
    }

    public static int majEleBrute(int[] nums) {
        int n = nums.length;
        int majCount = n / 2;

        for (int num : nums) {
            int count = 0;
            for (int ele : nums) {
                if (ele == num)
                    count++;
            }

            if (count > majCount) {
                return num;
            }
        }
        return -1;

        // T.C: O(n^2)
        // S.C: O(1)
    }

    public static int majEleBetter(int[] nums) {
        Map<Integer, Integer> map = countFreq(nums);

        Map.Entry<Integer, Integer> majEntry = null;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e == null || e.getValue() > majEntry.getValue()) {
                majEntry = e;
            }
        }
        return majEntry.getKey();

        // T.C: O(n)
        // S.C : O(n)
    }

    private static Map<Integer, Integer> countFreq(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!map.containskey(num)) {
                map.put(num, 1);
            } else {
                map.put(nums, map.get(nums) + 1);
            }
        }

        return map;
    }

    // using Moore Voting Algorithm
    public static int majEleOptimal(int[] nums) {
        int maj = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                maj = nums[i];
            }

            if (nums[i] == maj) {
                count++;
            } else {
                count--;
            }
        }

        return maj;

        // T.C: O(n)
        // S.C: O(1)
    }
}