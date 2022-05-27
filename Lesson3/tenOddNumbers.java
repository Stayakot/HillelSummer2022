package Lesson3;

import java.util.Arrays;

public class tenOddNumbers {


    public static void main(String[] args) {
        System.out.println("Создайте массив, содержащий 10 первых нечетных чисел.");
        System.out.println("Выведете элементы массива на консоль в одну строку, разделяя запятой.");
        System.out.println();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = 2 * i + 1;

        }
        System.out.print(Arrays.toString(array));
    }
}
