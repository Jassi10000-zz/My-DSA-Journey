import java.util.Scanner;

public class maxEle{

    public static Scanner sc = new Scanner(System.in);

    public static int maxEle_(int[] arr){

        int maxElem = (int) -1e8;
        for(int ele:arr){
            if(ele > maxElem) maxElem = ele;
        }
        return maxElem;
    }

    public static void main(String[] args){

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Max element is : " + maxEle_(arr));
    }
}