import java.util.Scanner;

public class function1 {

    public static int multiplication(int a, int b) {
        int multiply = a * b;

        return multiply;
    }

    public static void main(String args[]) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        num2 = sc.nextInt();
        int prod = multiplication(num1, num2);
        System.out.println("Multiplication of two number: " + prod);

    }
}