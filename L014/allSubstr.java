// In java , String datatype starts with 'S'

import java.util.Scanner;

public class allSubstr{


    public static Scanner sc = new Scanner(System.in);

    public static void allSubstr_(String str){

        for(int i=0;i<str.length();i++){
            for(int len=1;i+len<=str.length();len++){
                System.out.println(str.substring(i,i+len));
            }
        }

    }
    
    public static void main(String[] args){

        String str = sc.nextLine();

        allSubstr_(str);
    }
}
