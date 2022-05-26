package Lesson3;

import java.util.Scanner;

public class Degree {

    //Даны переменные x и n вычислить x^n.

    public static void main(String[] args) {

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
