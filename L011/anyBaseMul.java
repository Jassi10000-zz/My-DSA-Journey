import java.util.*;

public class anyBaseMul{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int rv = 0;
     int p=1;
     while(n2!=0){
         int d2 =  n2%10;
         n2 = n2/10;
         
         int spro = singleProduct(b,n1,d2);
         
         rv = getSum(b,rv,spro*p);
         p*=10;
         
     }
     return rv;
     
 }
 
 public static int singleProduct(int b,int n1, int d1){
     
     int res = 0,carry = 0,p = 1;
     
     while(n1!=0 || carry!=0){
         
         int r1 = n1%10;
         n1=n1/10;
         
         int pro = r1*d1 + carry;
         
         carry=pro/b;
         pro=pro%b;
         
         res+=pro*p;
         p*=10;
         
         
     }
     
     
     return res;
 }
 
 public static int getSum(int b, int n1, int n2){
       // write ur code here
       int ans=0,carry=0,p=1;
       while(n1!=0||n2!=0||carry!=0){
           int r1=n1%10;
           int r2=n2%10;
           
           n1/=10;
           n2/=10;
           
           int t=r1+r2+carry;
           carry=t/b;
           t=t%b;
           
           ans=ans+t*p;
           p=p*10;
           
       }
       return ans;
   }

}