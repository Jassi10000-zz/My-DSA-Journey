withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
withoutX2("xxHi") → "Hi"
withoutX2("Hix") → "Hix"
withoutX2("xaxb") → "axb"
withoutX2("xx") → ""	""
withoutX2("x") → ""	""
withoutX2("") → ""	""
withoutX2("Hello") → "Hello"
withoutX2("Hexllo") → "Hexllo"
withoutX2("xHxllo") → "Hxllo"



import java.util.Scanner;

public class withoutX2{

    public static Scanner sc = new Scanner(System.in);
    public static String withoutX2_(String str){

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(i<2 && str.charAt(i) != 'x') sb.append(str.charAt(i));
            if(i>=2) sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args){

        String str = sc.nextLine();

        System.out.println(withoutX2_(str));
        
    }
}
