import java.util.Scanner;

public class Example20 {
    public static void main(String [] argv) {
        double year;
        System.out.println("Enter year");

        Scanner in;
        in = new Scanner(System.in);
        year = in.nextDouble();

        if (year % 100 == 0) {
            System.out.println("Secular year");
        } else {
            System.out.println("Not secular");
        }
        if (year % 4 == 0) {
            System.out.println("Leap year");
        }
    }
}
