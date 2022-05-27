package Lesson3;

import java.util.Scanner;

public class Degree {

    //

    public static void main(String[] args) {
        System.out.println("Даны переменные x и n вычислить x^n.");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int degree = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * value;
        }
        System.out.println(result);
    }
}
