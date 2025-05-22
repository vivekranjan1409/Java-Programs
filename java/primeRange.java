import java.io.Console;

public class primeRange {


    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
     

    System.out.println(); 
    }
    public static void main(String args[]){
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter the number: "));

        primesInRange(num);
    }
}
