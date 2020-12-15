import java.util.Scanner;
import java.util.Arrays;

public class firstIdx{

    public static Scanner sc = new Scanner(System.in);

    public static int firstIdx_(int[] arr, int target){
        
        int idx = -1;


        for(int i=0; i<arr.length;i++){
            if ( arr[i] == target) {
                idx= i;
                break;
            }
        }


        return idx;
    }   

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        System.out.println(firstIdx_(arr, d));

    }
}
