import java.util.*;

public class pattern9 {

    public static Scanner sc = new Scanner(System.in);
    public static void pattern9_(int row){
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if((i == j) ||((i+j == row+1) && (i != j))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        
        int n = sc.nextInt();
        pattern9_(n);

    }
}