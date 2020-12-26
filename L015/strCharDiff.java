import java.util.Scanner;

public class strCharDiff{

    public static Scanner sc = new Scanner(System.in);

    public static String strCharDiff_(String str){

        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            int diff = str.charAt(i) - str.charAt(i-1);

            sb.append(diff);
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args){

        String str = sc.nextLine();
        strCharDiff_(str);
    }
}