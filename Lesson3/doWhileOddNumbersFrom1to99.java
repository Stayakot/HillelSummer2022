package Lesson3;

public class doWhileOddNumbersFrom1to99 {
    public static void main(String[] args) {
        System.out.println("При помощи цикла doWhile вывести на экран нечетные числа от 1 до 99.");
        int number = 0;
        do {
            if (number % 2 != 0)
                System.out.print(number + " ");
            number++;
        }

        while (number <= 99);
        System.out.println();
    }
}
