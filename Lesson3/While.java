package Lesson3;

import java.util.Scanner;

public class While {
//Перепишите программы (1 и 2) с использованием цикла while.
    public static void main(String[] args) {
        int number = 0;
        while ( number <= 99){
            if (number%2!=0)
                System.out.print(number + " ");
            number++;
        }
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

