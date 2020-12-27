import java.util.Scanner;
import java.util.Arrays;

public class diffOfTwoArr{

    public static Scanner sc = new Scanner(System.in);

    public static void diffOfTwoArr_(int[] arr1, int[] arr2){

        int a = arr1.length;
        int b = arr2.length;
    
        int c = Math.max(a,b);
    
        int[] resarr = new int[c];
        int i = a - 1;
        int j = b - 1;
    
        int k = c - 1;
    
        int carry = 0;
        while(k >= 0){
    
            int diff = 0;
            int a1val = i>=0? arr1[i] : 0; //especially for cases like 1000 - 1
    
            if(arr2[j] + carry >= a1val){
                diff = arr2[j] + carry - a1val;
                carry = 0;
            }
            else{
                diff = arr2[j] + carry - a1val + 10;
                carry = -1;
            }
    
            resarr[k] = diff;
    
            i--;
            j--;
            k--;
        }
    
        // now is the case of printing ---> instead of printing  0999  , we have to print 999
        int index = 0;
    
            while(index < resarr.length){
                if(resarr[index] == 0){
                    index++;
                }else{
                    break;
                }
            }
    
            while(index < resarr.length){
                System.out.println(resarr[index]);
                index++;
            }
    
    }
    
    
    public static void main(String[] args){
    
        int n=sc.nextInt();
    
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
    
        int m =sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
    
        diffOfTwoArr_(arr1,arr2);
    
        
    
    }
}