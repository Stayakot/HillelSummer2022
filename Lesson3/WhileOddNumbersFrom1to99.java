package Lesson3;

import java.util.Scanner;

public class WhileOddNumbersFrom1to99 {

    public static void main(String[] args) {
        System.out.println("При помощи цикла while вывести на экран нечетные числа от 1 до 99.");
        System.out.println();
        int number = 0;
        while (number <= 99) {
            if (number % 2 != 0)
                System.out.print(number + " ");
            number++;
        }
    }

}