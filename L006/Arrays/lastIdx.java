import java.util.Scanner;

public class lastIdx{

    public static Scanner sc = new Scanner(System.in);

    public static int lastIdx_(int[] arr , int target){
        
        int idx = -1;
        for(int i=arr.length-1; i>=0;i--){
            if ( arr[i] == target) {
                idx= i;
                break;
            }
        }

        return idx;
    }   

public static void main(String[] args){

    int n = sc.nextInt();
    

    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    int d = sc.nextInt();
    System.out.println("Last index of " + d + " is " + lastIdx_(arr,d));
    
}
}
