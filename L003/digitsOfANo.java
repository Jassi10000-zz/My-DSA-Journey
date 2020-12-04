import java.util.Scanner;

public class digitsOfANo {

    public static Scanner sc = new Scanner(System.in);

    public static void digitsOfANo_(int no) {
        int nod = countOfDigits(no);

        int div = (int)Math.pow(10 , nod-1);

        while(div != 0 ){
            int quot = no / div;
            System.out.println(quot);
            no %= div;
            div /= 10;
        }

    }

    public static int countOfDigits(int no) {

        int count = 0;
        while(no != 0){
            no = no/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        int no = n;

        digitsOfANo_(no);
    }
}