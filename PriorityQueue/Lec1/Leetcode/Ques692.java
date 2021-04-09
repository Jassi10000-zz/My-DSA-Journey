import java.util.*;
import java.io.*;

public class Ques692 {
    public List<String> topKFrequent(String[] words, int k) {

        // map to store the freq of each word in String of words
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {

            if (map.get(a) == map.get(b)) {
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);

        });

        for (String word : map.keySet()) {
            pq.add(word);
            if (pq.size() > k) {
                pq.remove();
            }
        }

        List<String> ans = new ArrayList<>();
        while (pq.size() != 0) {
            ans.add(pq.remove());
        }

        Collections.sort(ans, (a, b) -> {
            if (map.get(a) == map.get(b)) {
                return a.compareTo(b);
            } else {
                return map.get(b) - map.get(a);
            }
        });

        return ans;
    }
}