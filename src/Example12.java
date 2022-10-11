import java.util.Scanner;

public class Example12 {
    public static void main(String[] argv) {
        float a;
        float b;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter first value");
        a = inputValue.nextFloat();
        System.out.println("Enter second value");
        b = inputValue.nextFloat();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}