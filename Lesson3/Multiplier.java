package Lesson3;

import java.util.Scanner;

public class Multiplier {
    //Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.print(number * i + " ");
            i++;
        }

    }
}
