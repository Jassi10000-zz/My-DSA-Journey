import java.util.*;
import java.util.Scanner;

public class leetcode11 {
    // brute force
    // T.C: O(n^2)
    // S.C: O(1)
    // but this approach fails on large height lengths
    public static int maxArea1(int[] height) {
        int maxVol = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int l = j - i;
                int h = Math.min(height[i], height[j]);
                maxVol = Math.max(maxVol, l * h);
            }
        }
        return maxVol;
    }

    // optimised approach
    // T.C : O(n)
    // S.C : O(1)
    public static int maxArea2(int[] height) {
        int maxVol = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int l = j - i;
            int h = Math.min(height[i], height[j]);
            maxVol = Math.max(maxVol, l * h);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxVol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new height[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        maxArea1(height);
        maxArea2(height);
    }
}