package Lesson2;


import java.util.Random;

public class AverageTwoNumbers {
    Random random = new Random();
    int firstNumber = random.nextInt();
    int secondNumber = random.nextInt();

    public void averageNumber() {
        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secondNumber);
        System.out.println("Среднее значение: " + (firstNumber + secondNumber) / 2);
    }


    public static void main(String[] args) {
        AverageTwoNumbers averageTwoNumbers = new AverageTwoNumbers();
        averageTwoNumbers.averageNumber();

    }
}
