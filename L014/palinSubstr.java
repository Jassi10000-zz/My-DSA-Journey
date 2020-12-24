import java.util.Scanner;

public class palinSubstr{


    public static Scanner sc = new Scanner(System.in);

    public static void palinSubstr_(String str){

        for(int i=0;i<str.length();i++){
            for(int len=1;i+len<=str.length();len++){
                String s = str.substring(i,i+len);
                if(isPalindrome(s)){
                    System.out.println(s);
                }
            }
        }

    }

    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;

    while(i<j){

        if(str.charAt(i++) != str.charAt(j--)) return false;

    }
    return true;

    }
    
    public static void main(String[] args){

        String str = sc.nextLine();

        palinSubstr_(str);
    }
}
