import java.io.Console;

public class prime {
    // public static boolean isPrime(int n) {
    // // boolean isPrime = true;
    // if (n == 2) {
    // return true;
    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // // isPrime = false;
    // // break;
    // return false;
    // }
    // }
    // // return isPrime;
    // return true;
    // }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter the number: "));

        System.out.println(isPrime(num));

    }
}
