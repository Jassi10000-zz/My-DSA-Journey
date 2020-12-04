import java.util.*;

public class pattern7{
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void pattern7_(int row){
        int nsp = 0;
       
        
        for(int r = 1;r<=row;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            System.out.print("*");
            nsp++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n  = sc.nextInt();
        // write ur code here
        pattern7_(n);

    }
}