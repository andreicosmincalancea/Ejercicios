import java.util.Scanner;

public class Example16 {
    public static void main(String [] argv) {
        int grade;
        Scanner inputValue;
        System.out.println("Enter a number from 1 to 10");

        inputValue = new Scanner(System.in);
        grade = inputValue.nextInt();

        switch (grade) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
            default -> System.out.println("ERROR");
        }
    }
}
