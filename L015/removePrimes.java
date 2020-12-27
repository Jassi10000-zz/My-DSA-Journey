import java.util.Scanner;
import java.util.ArrayList;

public class removePrimes{
    
    public static Scanner sc = new Scanner(System.in);

    //In arraylist we use .get() method to get an element , not .charAt like we used in Strings
    public static void removePrimes_(ArrayList<Integer> arl){

        for(int i=arl.size()-1;i>=0;i--){
            
            int value = arl.get(i);
            if(isPrime(value)){
                arl.remove(i);
            }
        }  

    }

    public static boolean isPrime(int value){

        for(int i=2;i*i<=value;i++){
            if(value % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){

        int n = sc.nextInt();
        ArrayList<Integer> arl = new ArrayList<>();

        for(int i=0;i<n;i++){
            arl.add(sc.nextInt());
        }
        removePrimes_(arl);
        System.out.println(arl);
   
    }
}

                                    