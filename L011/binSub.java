import java.util.Scanner;

public class binSub{

    public static Scanner sc = new Scanner(System.in);

    public static int binSub_(int n1, int n2){
        int res=0,borrow=0,p=1;
       while(n1!=0||n2!=0){
           int r1=n1%10;
           int r2=n2%10;
           
           n1/=10;
           n2/=10;
           
           int ans = r2-r1 + borrow;
           if(ans < 0){
               ans += 2;
               borrow = -1;
           }
           else{
               borrow = 0;
           }
           
           res += ans*p;
           p*=10;
           
       }
       return res;



    }

    public static void main(String[] args){

        int n1=sc.nextInt();
        int n2=sc.nextInt();

        

        System.out.println(binSub_(n1,n2));
    }
}