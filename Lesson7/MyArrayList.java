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
        list[size] = value;
        size++;
        if (size == list.length) {
            String[] newArray = new String[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                newArray[i] = list[i];
            }
            list = newArray;

        }
        return true;
    }

    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }
        if (size == list.length) {
            String[] newArray = new String[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                newArray[i] = list[i];
            }
            list = newArray;
        }
        for (int i = size - 1; i >= index; i--) {
            list[i + 1] = list[i];
        }
        list[index] = value;
        size++;
        return true;
    }


    //проверяем индексы, не выходят ли они за границы массива
    private void isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Элемента нет "
                    + "Количество элементов в масиве = " + size
                    + ". Общее количество элементов = " + list.length);
        }
    }

    //Удаляет элемент по индуксу
    public boolean delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size ; i++) {
                list[i] = list[i+1];
            }
            size--;
        }
        return true;
    }

    //Удаляет элемент по value
    public boolean delete(String value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (value.equals(list[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            delete(index);
        }
        return true;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }
}