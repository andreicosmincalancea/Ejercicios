import java.util.Scanner;
public class Example25 {
    public static void main(String [] argv) {
        float number;
        float mult = 10;
        float table = 0;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter number");
        number = inputValue.nextFloat();

        for (float i = 1; i <= mult; i++) {
            table = i * number;
            System.out.println("The table of number " + number + " is: " + table);
        }
    }
}
