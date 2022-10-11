import java.util.Scanner;
public class Example21while {
    public static void main(String [] argv) {
        int positives, i, num;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        i = 0; // contador de las iteraciones
        positives = 0;
        while (i < 10) { // cuando las iteraciones lleguen a 10, se acaba el loop
            num = inputValue.nextInt();
            if (num >= 0) {
                positives = positives +1; // cuando encuentra un número positivo, añade 1 a la variable
            }
            i = i + 1;  // final del loop, suma 1 iteración
        }
        System.out.println(positives + " positives");
    }
}
