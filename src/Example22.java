public class Example22 {
    public static void main(String [] argv) {
        int sum, product;
        sum = 0;
        product = 1;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i; // sum + i porque aprovecho el contador de las iteraciones porque coinciden con los 10 primeros números naturales
            product = product * i; // porque i representa los 10 primeros números naturales
        }
        System.out.println("Sum from 1 to 10: " + sum);
        System.out.println("Product from 1 to 10: " + product);
    }
}
