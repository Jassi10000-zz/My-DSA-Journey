import java.util.Scanner;

public class rotateMatrixBy90{

    public static Scanner sc = new Scanner(System.in);

    public static void rotate(int[][] arr){

        //transpose
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //swap-columns
        for(int i=0;i<arr.length;i++){
            int li = 0;
            int ri = arr[i].length - 1;
            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
        display(arr);

    }

    public static void display(int[][] arr){

        for(int i =0 ;i<n;i++){
            for(int j=0;j<n;j++){

                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        rotate(arr);

    }

}