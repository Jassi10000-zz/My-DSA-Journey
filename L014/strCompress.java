import java.util.Scanner;

public class strCompress {

    public static Scanner sc = new Scanner(System.in);

    public static String strCompress2_(String str) {

        if (str.length() <= 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        int i = 1;
        while (i <= str.length()) {

            int count = 1;

            while (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {

                count++;
                i++;

            }
            if (count != 1) {
                sb.append(count);
            }
            if (i < str.length())
                sb.append(str.charAt(i));
            i++;
        }

        return sb.toString();
    }

    public static String strCompress1_(String str) {

        if (str.length() <= 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        int i = 1;
        while (i <= str.length()) {
            while (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                i++;
            }
            if (i < str.length())
                sb.append(str.charAt(i));
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = sc.nextLine();

        System.out.println(strCompress2_(str));
        System.out.println(strCompress1_(str));
    }
}
