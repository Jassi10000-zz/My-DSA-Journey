import java.util.Scanner;

public class sumOfTwoArr{
    public static Scanner sc = new Scanner(System.in);

    public static void sumOfTwoArr_(int[] arr1 , int[] arr2){

        int a = arr1.length;
        int b = arr2.length;
    
        int c = Math.max(a,b) + 1;
    
        int[] resarr = new int[c];
        int i = a - 1 ;
        int j = b - 1;
        int r = c - 1;
    
        int carry = 0;
        while( r >= 0){
            
            int sum = carry;
    
            if(i >= 0) sum += arr1[i--];
            if(j >= 0) sum += arr2[j--];
    
            resarr[r--] += sum%10;
            carry = sum/10;
        }
    
        for(int l=0;l<resarr.length;l++){
    
            if( l==0 && resarr[l]== 0) continue;
            System.out.println(resarr[l]);
        }
    
    }
    
    
    public static void main(String[] args){
    
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
    
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
    
    
        sumOfTwoArr_(arr1,arr2);
    
    }
}