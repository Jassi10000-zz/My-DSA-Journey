import java.util.Scanner;

public class toggleCase{

    public static Scanner sc = new Scanner(System.in);

    public static String toggleCase_(String str){

        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch >= 'a' && ch <='z'){
                sb.append((char)(ch -'a' + 'A'));
            }else{
                sb.append((char)(ch + 'a' - 'A'));
            }
        
        }
        return sb.toString();

    }

    public static void main(String[] args){

        String str = sc.nextInt();

        toggleCase_(str);
    }
}