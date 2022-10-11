import java.util.Scanner;
public class Example21for {
    public static void main(String [] argv) {
        int positives, num; // en la estructura FOR ya se declara el contador

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        positives = 0;
        for (int i = 0; i < 10; i++) { // // cuando solo se quiere sumar 1, se puede abreviar poniendo ++. i++ = i = i + 1
            num = inputValue.nextInt();
            if (num >= 0) {
                positives = positives + 1;
            }
        }
        System.out.println(positives + " positives");
        }
}
