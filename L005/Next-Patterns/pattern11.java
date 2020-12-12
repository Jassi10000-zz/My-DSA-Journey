import java.util.Scanner;

public class pattern11{

    public static Scanner sc = new Scanner(System.in);

    public static void pattern11_(int n){

        int nsp=1;
        int count = 0;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                count++;
                System.out.print( count + "\t");
                
            }
            nsp++;
            
            System.out.println();
        }


    }


    public static void main(String[] args){

        int n = sc.nextInt();
        pattern11_(n);
    }
}
