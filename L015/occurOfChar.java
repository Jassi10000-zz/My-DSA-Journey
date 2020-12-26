import java.util.Scanner;
import java.util.ArrayList;

public class occurOfChar{

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<Integer> allIdx(String str ,  char ch){


        if(str.length() <=1){
            System.out.println(str);
        }
        ArrayList<Integer> arl = new ArrayList<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch) arl.add(i);
        }

        return arl;
    }
    public static void main(String[] args){

        String str = sc.nextLine();
        String ch = sc.nextLine();
        char data = ch.charAt(0);

        ArrayList<Integer> ans = allIdx(str,data);
        System.out.println(ans);
        
    }
}


