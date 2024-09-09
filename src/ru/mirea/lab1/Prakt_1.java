package ru.mirea.lab1;

public class Prakt_1 {
    public static void prakt_1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Sum: %d, Arithmetic mean: %.2f", sum, (float)sum / (float)arr.length);
    }
}
