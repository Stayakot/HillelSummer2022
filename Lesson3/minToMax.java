package Lesson3;

import java.util.Arrays;

public class minToMax {

    public static void main(String[] args) {
        System.out.println("Поменять наибольший и наименьший элементы массива местами.");
        System.out.println("Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.");
        int[] array = {4, -5, 0, 6, 8};
        int maxNumber = 0;
        int maxIndex = 0;
        int minNumber = 100;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxIndex = i;

            }
            if (array[i] < minNumber) {
                minNumber = array[i];
                minIndex = i;

            }
        }
        System.out.println(Arrays.toString(array));
        array[maxIndex] = minNumber;
        array[minIndex] = maxNumber;
        System.out.println(Arrays.toString(array));
    }
}
