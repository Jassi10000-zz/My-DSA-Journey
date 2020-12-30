import java.util.Scanner;

public class inverseArr{

    public static Scanner sc = new Scanner(System.in);
    public static void inverse(int[] a){

        int[] inv = new int[a.length];
        for(int i=0;i<a.length;i++){
            int val = a[i];
            inv[val] = i;
        }


        for(int ele:inv) System.out.println(ele);
    }
    public static void main(String[] args){

        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        inverse(a);
    }
}