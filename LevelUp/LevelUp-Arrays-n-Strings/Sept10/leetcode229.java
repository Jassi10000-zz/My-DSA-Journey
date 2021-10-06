import java.util.*;
import java.util.Scanner;

public class leetcode229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        majEle2Brute(nums);
        majEle2Better(nums);
        majEle2Optimal(nums);

    }

    // Brute force approach :
    // T.C: O(n^2)
    // S.C: O(n)
    public static List<Integer> majEle2Brute(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int majorityCount = n / 3;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int count = 0;
            for (int j = 1; j < n; j++) {
                if (num == nums[j]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                ans.add(nums[i]);
            }
        }

        for (int i = ans.size(); i >= 0; i--) {
            if (ans.get(i) == ans.get(i + 1)) {
                ans.remove(ans.get(i));
            }
        }

        return ans;
    }

    // Better Approach
    // T.C: O(n)
    // S.C: O(1)
    public static List<Integer> majEle2Better(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 1) {
            ans.add(nums[0]);
            return ans;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer i : map.KeySet()) {
            if (map.get(i) > nums.length / 3) {
                ans.add(i);
            }
        }

        return ans;
    }

    // Optimal Approach
    // T.C: O(n)
    // S.C: O(1)
    public static List<Integer> majEle2Optimal(int[] nums) {
        int num1 = -1, num2 = -1, n= nums.length,count1=0,count2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == num1){
                count1++;
            }else if(nums[i] == num2){
                count2++;
            }else if(count1 == 0){
                num1 = nums[i];
                count1 = 1;
            }else if(count2 == 0){
                num2 = nums[i];
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        count1 = 0, count2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == num1){
                count1;
            }else if( nums[i] == num2){
                count2++;
            }
        }

        if(count1 > n/3){
            ans.add(num1);
        }
        if(count2 > n/3){
            ans.add(num2);
        }
    }
}
