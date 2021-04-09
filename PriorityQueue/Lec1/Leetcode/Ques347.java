import java.io.*;
import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return a[1] - b[1];
        });

        for (Integer e : map.keySet()) {
            int value = e;
            int freq = map.get(value);

            int[] arr = new int[] { value, freq };
            pq.add(arr);

            while (pq.size() > k) {
                pq.remove();
            }
        }

        int[] ans = new int[k];
        int i = 0;
        while (pq.size() != 0) {
            ans[i++] = pq.remove()[0]; // for getting the value out of array present in PQ
        }

        return ans;

    }
}