package Lesson3;

import java.util.Scanner;

public class doWhile {

    //Перепишите программы (1 и 2) с использованием цикла do - while.

    public static void main(String[] args) {
        int number = 0;
        do {
            if (number % 2 != 0)
                System.out.print(number + " ");
            number++;
        }

        while (number <= 99);
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int result = 1;
        int i = 1;

        do {
            result = result * i;
            i++;

        }
        while (i <= numbers);
        System.out.println(result);
    }
}

