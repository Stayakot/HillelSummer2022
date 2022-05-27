package Lesson3;

import java.util.Scanner;

public class ForFactorial {

    public static void main(String[] args) {
        System.out.println("Дано число n при помощи цикла for посчитать факториал n!");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        int result=1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}