import java.io.Console;

public class funOver1 {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static void main(String args[]) {
        Console c = System.console();
        int a = Integer.parseInt(c.readLine("Enter first number: "));
        int b = Integer.parseInt(c.readLine("Enter the second number: "));
        float x = Float.parseFloat(c.readLine("Enter the first float number: "));
        float y = Float.parseFloat(c.readLine("Enter the second float number: "));

        System.out.println("Addition of two number: " + add(a, b));
        System.out.println("Addition of two float value: " + add(x, y));
    }

}
