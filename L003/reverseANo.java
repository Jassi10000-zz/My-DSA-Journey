import java.util.Scanner;

public class reverseANo {

    public static Scanner sc = new Scanner(System.in);

    public static int reverseANo_(int n) {

        int rev_n = 0;
        while (n > 0) {

            rev_n = rev_n * 10 + n % 10;

            n = n / 10;
        }
        return rev_n;
    }

    public static void main(String []args){
    
        int n = sc.nextInt();
    
        System.out.println("Reverse is : "+ reverseANo_(n));
    
    }

}
