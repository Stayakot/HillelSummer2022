package Lesson3;

import java.util.Arrays;

public class minToMax {

    //Поменять наибольший и наименьший элементы массива местами.
    // Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.

    public static void main(String[] args) {
        int[] array = {4, 8, 0, 6, -5};
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
