package Lesson3;

import java.util.Scanner;

public class doWhileFactorial {

    public static void main(String[] args) {
        System.out.println("Дано число n при помощи цикла doWhile посчитать факториал n!");
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

