import java.io.Console;

public class FunOver {
    public static int sum(int num1, int num2) {

        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String args[]) {
        Console c = System.console();
        int a = Integer.parseInt(c.readLine("Enter the first number: "));
        int b = Integer.parseInt(c.readLine("Enter the Second number: "));
        int d = Integer.parseInt(c.readLine("Enter the Third Number: "));
        int i = sum(a, b);
        int j = sum(a, b, d);
        System.out.println("Sum of two number: " + i);
        System.out.println("sum of three number: " + j);
    }
}
