public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            System.out.printf("i: %d fact: %d\n", i, Factorial.factorial(i));
        }
    }
}
