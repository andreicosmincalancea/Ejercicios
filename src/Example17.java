import java.util.Scanner;

public class Example17 {
    public static void main(String [] argv) {
        int hours;
        int minutes;
        int seconds;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Introduce hours");
        hours = inputValue.nextInt();
        System.out.println("Introduce minutes");
        minutes = inputValue.nextInt();
        System.out.println("Introduce seconds");
        seconds = inputValue.nextInt();
        seconds = seconds + 1;

        if (seconds == 60) {
            seconds = 0;
            minutes = minutes + 1;
        } else if (minutes == 60) {
            minutes = 0;
            hours = hours + 1;
        }
        System.out.println("Your time is: " + hours + ":" + minutes + ":" + seconds);
    }
}
