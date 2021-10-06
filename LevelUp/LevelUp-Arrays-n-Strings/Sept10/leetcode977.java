import java.util.*;
import java.util.Scanner;

public class leetcode977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortedSquares(nums);
        sortedSquares2(nums);
    }

    // brute force
    // T.C: O(nlogn)
    // S.C: O(1)
    public static int[] sortedSquares2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        return nums;
    }

    // optimal approach with
    // T.C: O(n)
    // S.C: O(n)
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0, j = n - 1;
        for (int k = n - 1; k >= 0; k--) {
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];

            if (val1 > val2) {
                result[k] = val1;
                i++;
            } else {
                result[k] = val2;
                j--;
            }
        }

        return result;
    }
}