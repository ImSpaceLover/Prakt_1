public class Main {
    public static void main(String[] args) {
        float part_sum = 0;
        for (int i = 1; i < 11; i++) {
            part_sum += 1/(float)i;
            System.out.printf("%d-й элемент гармонического ряда: ", i);
            for (int j = 1; j < i; j++) {
                System.out.printf("1/%d + ", j);
            }
            System.out.printf("1/%d = %f\n", i, part_sum);
        }
    }
}
