import java.util.Scanner;
public class Example24 {
    public static void main(String [] argv) {
        int i, factorial = 1, number;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number = inputValue.nextInt(); // Se tiene que poner aquí y no dentro del loop porque, de lo contrario, en cada iteración me preguntaría por el número

        for (i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
// el int limita