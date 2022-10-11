import java.util.Scanner;
public class Example29 {
    public static void main(String [] argv) {
        float a;
        float b;
        float i = 0;
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter first number");
        a = inputValue.nextFloat();
        System.out.println("Enter second number");
        b = inputValue.nextFloat();

        while (a >= b) {
            a = a - b;
            i = i + 1;
        }
        System.out.println("Remainder is: " + a);
    }
}
