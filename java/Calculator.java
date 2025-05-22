import java.util.Scanner;

public class Calculator {
    public static int Add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int Subtract(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int divide(int a, int b) {
        int div = a / b;
        return div;
    }

    public static int modulo(int a, int b) {
        int mod = a % b;
        return mod;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        System.out.println(
                "Enter the operation to perform:\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for modulo ");
        int ch = sc.nextInt();
        int res;
        switch (ch) {
            case 1:
                res = Add(num1, num2);
                System.out.println("Sum of two number: " + res);
                break;

            case 2:
                res = Subtract(num1, num2);
                System.out.println("Subtraction of two number: " + res);
                break;

            case 3:
                res = multiply(num1, num2);
                System.out.println("Multiplication of two number: " + res);
                break;

            case 4:
                res = divide(num1, num2);
                System.out.println("Division of two number: " + res);
                break;

            case 5:
                res = modulo(num1, num2);
                System.out.println("Modulo of two number: " + res);
                break;

            default:
                System.out.println("Wrong input!");
                break;
        }

    }
}
