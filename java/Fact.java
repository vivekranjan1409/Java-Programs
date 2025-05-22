import java.util.Scanner;

public class Fact {
    public static int findFactorial(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextInt();

        int res = findFactorial(a);
        System.out.println("Factorial is " + res);

    }

}
