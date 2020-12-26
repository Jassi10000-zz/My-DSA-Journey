import java.util.Scanner;
import java.util.ArrayList;

public class subSeq{

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> subSeq_(String str){

        ArrayList<String> ans = new ArrayList<>();
        ans.add(" ");

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int size = ans.size();
            for(int j=0;j<size;j++){
                ans.add(ans.get(j) + ch);
            }
        }

        return ans;
    }

    public static void main(String[] args){

        String str = sc.nextLine();
        ArrayList<String> ans = subSeq_(str);
        
        System.out.println(ans);

    }
}