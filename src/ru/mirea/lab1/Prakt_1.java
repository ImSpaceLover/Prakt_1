package ru.mirea.lab1;
import java.util.Locale;
import java.util.Scanner;

public class Prakt_1 {
    public static void prakt_1() {
        float[] arr = new float[10];

        Scanner sc = new Scanner(System.in);

        int i = 0;
        do {
            arr[i] = sc.nextFloat();
            i+=1;
        } while (i < arr.length);

        i = 0;

        float sum = 0;
        float max_n = Float.MIN_VALUE;
        float min_n = Float.MAX_VALUE;

        while (i < arr.length) {
            sum += arr[i];
            max_n = Float.max(max_n, arr[i]);
            min_n = Float.min(min_n, arr[i]);
            i += 1;
        }

        System.out.printf("Sum: %.3f, Max: %.3f, Min: %.3f", sum, max_n, min_n);
    }
}
