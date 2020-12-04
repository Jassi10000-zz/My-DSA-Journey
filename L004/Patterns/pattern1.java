import java.util.Scanner;

public class pattern1{

    public static Scanner sc = new Scanner(System.in);

    public static void pattern1_(int row){
        int nst=1;
        for(int r=1;r<=row;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.println("*\t");
            }
            nst++;
            System.out.println();
        }
    }
    
    public static void main(String []args){
    
        int n = sc.nextInt();
    
        pattern1_(n);
        
    }
}