1. This is the first presentation of a reverse no.
I/P : 8366435     O/P : 5346638
    
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



import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void reverseANo_(int n) {

        
        while (n > 0) {

            int r = n % 10;
            System.out.println(r);
            n = n / 10;
        }
        
    }

    public static void main(String []args){
    
        int n = sc.nextInt();
    
        reverseANo_(n);
    
    }

}
