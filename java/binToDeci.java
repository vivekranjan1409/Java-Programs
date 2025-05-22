import java.io.Console;
public class binToDeci {
    public static void bintodeci(int binNum) {
        int myNm = binNum;
        int pow = 0;
        int decimal = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNm + " = " + decimal);
    }

    public static void main(String args[]) {
        Console c = System.console();
        int binNu = Integer.parseInt(c.readLine("Enter the binary number: "));

        bintodeci(binNu);
    }
}
