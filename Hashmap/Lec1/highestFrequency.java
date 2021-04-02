import java.util.HashMap;

public class highestFrequency {
    public static void basic_01(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
       
           for(int i = 0 ; i<str.length();i++){
               char ch = str.charAt(i);
               if(map.containsKey(ch)) map.put(ch,map.get(ch) + 1);
               else map.put(ch,1);
           }

          char ans = ' ';
          int freq = 0;
          for(Character ch : map.keySet()){
                if(map.get(ch) > freq){
                    freq = map.get(ch);
                    ans = ch;
                }
          }
          System.out.println(map);
          System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "abbbaaabbababaaab";
        basic_01(str);
    }
}