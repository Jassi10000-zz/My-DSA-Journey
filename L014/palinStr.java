import java.util.Scanner;

public class palinStr{


    public static Scanner sc = new Scanner(System.in);

    public static boolean palinStr_(String str){

        int i=0;
        int j=str.length()-1;

    while(i<j){

        if(str.charAt(i++) != str.charAt(j--)) return false;

    }
    return true;

    }
    
    public static void main(String[] args){

        String str = sc.nextLine();

        System.out.println(palinStr_(str));
        
    }
}
