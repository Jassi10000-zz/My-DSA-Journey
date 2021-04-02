import java.util.HashMap;

public class BasicHashMap {
    public static void basic_01() {

        HashMap<String, Integer> map = new HashMap<>();
        // let's add some data into the hashmap
        map.put("Nepal", 233);
        map.put("UK", 45);
        map.put("Germany", 35);
        map.put("USA", 20);
        map.put("Russia", 18);
        map.put("India", 10);

        for (String keys : map.keySet()) {
            System.out.println(keys + "--> " + map.get(keys));
        }
    }

    public static void main(String[] args) {
        basic_01();
    }
}