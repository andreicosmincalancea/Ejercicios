import java.util.Scanner;
public class Example14 {
    public static void main(String [] argv) {
        float a;
        float b;
        float c;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Introduce first number");
        a = inputValue.nextFloat();
        System.out.println("Introduce second number");
        b = inputValue.nextFloat();
        System.out.println("Introduce third number");
        c = inputValue.nextFloat();

        if (a >= b) {
            if (b >= c)
                System.out.println("" + c + "," + b + "," + a);
            else if (c >= a)
                System.out.println("" + b + "," + a + "," + c);
            else if (a >= c)
                System.out.println("" + b + "," + c + "," + a);
        } else {
            if (c >= b)
                System.out.println("" + a + "," + b + "," + c);
            else if (c >= a)
                System.out.println("" + a + "," + c + "," + b);
            else if (a >= c)
                System.out.println("" + c + "," + a + "," + b);
        }
    }
}
