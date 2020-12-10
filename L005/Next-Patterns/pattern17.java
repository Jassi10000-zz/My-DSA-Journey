import java.util.Scanner;

public class pattern17{

    public static Scanner sc = new Scanner(System.in);

    public static void pattern17_(int n){

        int nsp = n/2;
    int nst = 1;
    
    for(int i=1;i<=n;i++){

        for(int j=1;j<=nsp;j++){

            if(i == n/2 + 1){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
            
        }

        for(int j=1;j<=nst;j++){
            System.out.print("*\t");
        }

        if(i <= n/2){
            nst++;
        }
        else{
            nst--;
        }
        
        System.out.println();
    }

    }


    public static void main(String []args){

        int n = sc.nextInt();

        pattern17_(n);
    }
}