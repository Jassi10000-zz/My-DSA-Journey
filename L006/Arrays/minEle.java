import java.util.Scanner;

public class minEle{

    public static Scanner sc = new Scanner(System.in);

    public static int minEle_(int[] arr){

        int minElem = (int) 1e8;
        for(int ele:arr){
            if(ele < minElem) minElem = ele;
        }
        return minElem;
    }

    public static void main(String[] args){

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Min element is : " + minEle_(arr));
    }
}
