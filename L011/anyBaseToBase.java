import java.util.*;
  
  public class anyBaseToAnyBase{
      public Scanner sc = new Scanner(System.in);

     public static int abtd(int n, int a) {

        int sum = 0;
        int p = 1;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;

            sum += r * p;
            p *= a;
        }

        return sum;
    }
    
    
     public static int dtab(int n, int a) {

        int sum = 0;
        int p = 1;
        while (n != 0) {
            int r = n % a;
            n = n / a;

            sum += r * p;
            p *= 10;
        }

        return sum;
    }
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int ans = abtd(n,sourceBase);
     System.out.println(dtab(ans,destBase));
     
   }   
  }