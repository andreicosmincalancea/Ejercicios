import java.util.Scanner;
public class Example26 {
    public static void main(String [] argv) {
        float number;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter number");
        number = inputValue.nextFloat();

        for (float i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(" " + i);
            }
        }
    }
}
