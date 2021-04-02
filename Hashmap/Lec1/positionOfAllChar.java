import java.util.HashMap;
import java.util.ArrayList;

public class positionOfAllChar {
    public static void basic_01(String str) {

        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();

        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (!map.containsKey(ch)) {
        // map.put(ch, new ArrayList<>());

        // map.get(ch).add(i);
        // }
        // }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if character is not present in map then do this
            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
        }

        for (Character ch : map.keySet()) {
            System.out.println(ch + " --> " + map.get(ch));
        }

    }

    public static void main(String[] args) {
        String str = "abbbaaabbababaaab";
        basic_01(str);
    }
}