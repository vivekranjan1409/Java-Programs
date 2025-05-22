import java.io.Console;
public class Ques2 {
    public static void main(String args[]){
        Console c = System.console();
        int num1 = Integer.parseInt(c.readLine("Enter the first number: "));
        int num2 = Integer.parseInt(c.readLine("Enter the second number: "));
        int num3 = Integer.parseInt(c.readLine("Enter the third number: "));

        float avg = (num1 + num2 + num3) / 3;

        System.out.println("Average of three number: "+avg);
        
    }
}
