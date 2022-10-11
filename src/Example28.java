import java.util.Scanner;
public class Example28 {
    public static void main(String [] argv) {
        float a;
        float b;
        float product = 0;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter first number");
        a = inputValue.nextFloat();
        System.out.println("Enter second number");
        b = inputValue.nextFloat();

        for (float i = 1; i <= b; i++) {
            product = product + a; // caso base
        }
        System.out.println("Product; " + product);
    }
}
