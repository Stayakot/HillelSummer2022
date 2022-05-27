package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class minElement {

    public static void main(String[] args) {
        System.out.println("Дан массив размерности N, найти наименьший");
        System.out.println("элемент массива и вывести на консоль (массив заполнить случайными числами из диапазона 0 .. 100)");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(array));
        int minNumber = 100;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < minNumber) {
                minNumber = array[i];
            }

        }
        System.out.println(minNumber);
    }
}
