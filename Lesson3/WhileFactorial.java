package Lesson3;

import java.util.Scanner;

public class WhileFactorial {
    public static void main(String[] args) {
        System.out.println("Дано число n при помощи цикла while посчитать факториал n!");
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        int numbers = scanner.nextInt();
        int result=1;
        int i=1;

        while ( i <= numbers) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

}
