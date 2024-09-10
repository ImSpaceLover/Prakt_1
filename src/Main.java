import ru.mirea.lab1.Prakt_1;

import java.util.Arrays;

import static ru.mirea.lab1.Prakt_1.prakt_1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.printf(args[i]);
        }
        System.out.println(Arrays.toString(args));
    }
}
