withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
withoutX2("xxHi") → "Hi"
withoutX2("Hix") → "Hi"
withoutX2("xaxb") → "ab"
withoutX2("xx") → ""
withoutX2("x") → ""
withoutX2("") → ""
withoutX2("Hello") → "Hello"
withoutX2("Hexllo") → "Hello"
withoutX2("xHxllo") → "Hllo"
import java.util.Scanner;

public class withoutX2 {

    public static Scanner sc = new Scanner(System.in);

    public static String withoutX2_(String str) {

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < str.length()) {

            if (str.charAt(i) != 'x') {
                sb.append(str.charAt(i));

            }
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = sc.nextLine();

        System.out.println(withoutX2_(str));

    }
}
