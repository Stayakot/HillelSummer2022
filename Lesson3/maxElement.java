package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//В массиве из задания 9. найти наибольший элемент

public class maxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(array));
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }

        }
        System.out.println(maxNumber);
    }
}


