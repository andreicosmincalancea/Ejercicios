import java.util.Scanner;

public class Example18 {
    public static void main(String[] argv) {
        double pph;
        double hours;
        double gp = 0;
        double np;
        double tax = 0;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter hours");
        hours = inputValue.nextFloat();
        System.out.println("Enter price per hour");
        pph = inputValue.nextFloat();

        if (hours <= 35) {
            gp = hours * pph;
        } else if (hours > 35) {
            gp = 35 * pph + (hours - 35) * pph * 1.5;
        }
        if (gp <= 500) {
            tax = 0;
        } else if (gp > 500 && gp <= 900) {
            tax = 500 * 0 + (gp - 500) * 0.25;
        } else if (gp > 900) {
            tax = 500 * 0 + 400 * 0.25 + (gp - 900) * 0.45;
        }
        np = gp - tax;
        System.out.println("Yours gross pay is " + gp);
        System.out.println("Your net pay is " + np);
        System.out.println("Your taxes are " + tax);
    }
}
