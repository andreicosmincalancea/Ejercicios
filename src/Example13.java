import java.util.Scanner;
public class Example13 {
    public static void main(String[] argv) {
        float a;
        float b;
        float c;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter first value");
        a = inputValue.nextFloat();
        System.out.println("Enter second value");
        b = inputValue.nextFloat();
        System.out.println("Enter third value");
        c = inputValue.nextFloat();

        if (a > b) {
            if (a > c) {
                System.out.println(a); //a es mayor que b y mayor que c
            } else {
                System.out.println(c); //a es mayor que b pero es menor que c
            }
        } else {
            if (b > c) {
                System.out.println(b); //a es menor que b pero b es mayor que c
            } else {
                System.out.println(c);//a es menor que b y b es menor que c
            }
        }
    }
}