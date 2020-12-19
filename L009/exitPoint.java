import java.util.Scanner;

public class exitPoint{

    public static Scanner sc = new Scanner(System.in);
    public static void exitPoint_(int[][] arr){

        int d = 0;
        int i=0,j=0;

        while(true){
            
            d = (d + arr[i][j]) % 4;

            if(d == 0){
                j++;
            }else if(d == 1){
                i++;
            }else if(d == 2){
                j--;
            }else if(d == 3){
                i--;
            }
            
            
            
            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++;
                break;
            }else if(i == arr.length){
                i--;
                break;
            }else if(j == arr[0].length){
                j--;
                break;
            }
        }


        System.out.println(i);
        System.out.println(j);


    }

    public static void main(String[] args){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        exitPoint_(arr);
    }

}
