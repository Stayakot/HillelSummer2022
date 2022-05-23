package Lesson2;

import java.util.Random;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество цифр для расчета: ");
        int number = scanner.nextInt();
        int[] numbers = new int[number];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        int sum = 0;

        for (int i : numbers) {
            sum = sum + i;
        }

        System.out.println(sum / numbers.length);

    }
}

