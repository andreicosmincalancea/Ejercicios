public class Example27 {
    public static void main(String [] argv) {
        double terms = 40;
        double first = 0;
        double second = 1;
        System.out.println("Fibonacci till " + terms);

        for (float i = 1; i <= terms; i++) {
            System.out.println(first);
            double next = first + second;
            first = second;
            second = next;
        }
    }
}
