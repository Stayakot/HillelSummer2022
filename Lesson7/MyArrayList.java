package Lesson7;

import java.util.Arrays;

public class MyArrayList<E> {
    private String[] list;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList() {  //
        this.list = new String[DEFAULT_CAPACITY];
    }


    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.list = new String[initialCapacity];
        } else {
            throw new IllegalStateException("Размер не может быть меньше 0!");
        }
    }

    //получает элемент по указанному индексу
    public String get(int index) {
        isIndexExist(index);
        return list[index];
    }


    //добавляем элемент в конец списка
    public boolean add(String value) {
        if (size == list.length) {
            list = increaseCapacity();
        }
        list[size] = value;
        size++;
        return true;
    }

    //Добавляет элемент по индуксу
    public boolean add(int index, String value) {
        if (size == list.length) {
            list = increaseCapacity();
        }
        list[index] = value;
        size++;
        return true;
    }


    //Метод для увеличения емкости массива
    private String[] increaseCapacity() {
        String[] temp = new String[(list.length * 2)];
        System.arraycopy(list, 0, temp, 0, list.length);
        return temp;
    }


    //проверяем индексы, не выходят ли они за границы массива
    private int isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Элемента нет "
                    + "Количество элементов в масиве = " + size
                    + ". Общее количество элементов = " + list.length);
        }
        return index;
    }

    //Удаляет элемент по индуксу
    public boolean delete(int index) {
        isIndexExist(index);
        String[] temp = list;
        list = new String[temp.length - 1];
        String value = temp[index];
        System.arraycopy(temp, 0, list, 0, index);
        System.arraycopy(temp, index + 1, list, index, temp.length - index - 1);
        size--;
        return true;
    }


    //Удаляет элемент
    public boolean delete(String value) {
        if (value == null) {
            for (int index = 0; index < size; index++)
                if (list[index] == null) {
                    fastRemove(index);
                    return true;

                }
        } else {
            for (int index = 0; index < size; index++)
                if (value.equals(list[index])) {
                    fastRemove(index);
                    return true;

                }
        }
        return false;

    }

    private void fastRemove(int index) {

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(list, index + 1, list, index,
                    numMoved);
        list[--size] = null;

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }
}