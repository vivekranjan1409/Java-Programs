import java.util.Scanner;

public class function {
    public static void printHelloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }

    public static void calculateSum(int num1, int num2) { // parameter or formalparameters

        int sum = num1 + num2;
        System.err.println("Sum of two number: " + sum);
    }

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter First Number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter Second Number: ");
        // int b = sc.nextInt();

        // calculateSum(a, b); // arguments or actual parameters
        // printHelloWorld();

        int a = 10;
        int b = 5;

        swap(a, b);
    }
}
