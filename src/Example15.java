import java.util.Scanner;

public class Example15 {
    public static void main(String [] argv) {
        int a;
        System.out.println("Enter value");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        a = inputValue.nextInt();

        if (a >= 0 && a < 3) {
            System.out.println("Muy deficiente");
        }
        else if (a >= 3 && a < 5) {
            System.out.println("Insuficiente");
        }
        else if (a == 5) {
            System.out.println("Suficiente");
        }
        else if (a == 6) {
            System.out.println("Bien");
        }
        else if (a >= 7 && a < 9) {
            System.out.println("Notable");
        }
        else if (a >= 9 && a <= 10) {
            System.out.println("Sobresaliente");
        }
    }
}


