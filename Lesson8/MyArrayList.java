package Lesson8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class MyArrayList<E> implements MyArrayListImpl {

    private String[] list;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList() {  //
        this.list = new String[DEFAULT_CAPACITY];
    }

    @Override
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

    @Override
    // Добавляет объект по индексу
    public boolean add(int index, String value) {
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

    private boolean delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            size--;
        }
        return true;
    }


    @Override
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


    private void isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Элемента нет "
                    + "Количество элементов в масиве = " + size
                    + ". Общее количество элементов = " + list.length);
        }
    }

    @Override
    //получает элемент по указанному индексу
    public String get(int index) {
        isIndexExist(index);
        return list[index];
    }

    @Override
    public boolean equals(Collection o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList that = (MyArrayList) o;
        return size == that.size && Arrays.equals(list, that.list);
    }


    @Override
    public boolean contain(String value) {

        return indexOf(value) >= 0;
    }

    public int indexOf(String value) {
        return indexOfRange(value, 0, size);
    }

    int indexOfRange(String value, int start, int end) {
        String[] lists = list;
        if (value == null) {
            for (int i = start; i < end; i++) {
                if (lists[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (value.equals(lists[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    @Override
    public boolean clear() {
        for (int i = 0; i < size; i++)
            list[i] = null;

        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }
}
