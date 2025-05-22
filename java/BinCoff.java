import java.util.Scanner;

public class BinCoff {
    public static int FindBinCoff(int n, int r) {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n - r);

        int nCr = nfact / (rfact * nrfact);
        return nCr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        int binCoff = FindBinCoff(num1, num2);
        System.out.println("Binomial Cofficient: " + binCoff);

    }
}