package Lesson8;

import java.util.Objects;


public class CollectionImpl implements Collection {
    private String[] array;
    private int count;
    private final int INITIAL_CAPACITY = 10;

    public CollectionImpl() {
        this.array = new String[INITIAL_CAPACITY];
        this.count = 0;
    }

    @Override
   // добавляет значение
    public boolean add(String value) {
        if (count == array.length) {
            grow(array.length * 2);
        }
        array[count++] = value ;
        return true;
    }

    @Override
   // добавляет значение по индексу.
    public boolean add(int index, String value) {
        if (index < 0 || index > count) {
            return false;
        }
        if (index == array.length) {
            grow(array.length * 2);
        }
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;

        count++;
        return true;
    }


    @Override
    //удаляет значение
    public boolean delete(String value) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], value)) {
                delete(i);
            }
        }
        return false;
    }

    @Override
    //получает значение по индексу.
    public String get(int index) {
        isOutOfBound(index);
        return array[index];
    }

    @Override
    //проверяет список на содержание какого-либо обьекта.
    public boolean contain(String value) {
        for (int i = 0; i < count; i++) {
            if (value == null & array[i] == null) {
                return true;
            }
            if (value == null | array[i] == null) {
                continue;
            }
            if (value.equals(array[i])) {
                return true;
            }
        }
        return false;
    }


    //сравнивает обьекты по размеру и значению.
    @Override
    public boolean equals(Collection str) {
        for (int i = 0; i < str.size(); i++) {
            for (int j = 0; j < str.size(); j++) {
                if (!(str.get(i).contains(array[j]))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    //очищает массив от всех обьектов.
    public boolean clear() {
        array = new String[10];
        this.count = 0;
        return true;
    }

    @Override
    //метод size получает размер списка.
    public int size() {
        return count;
    }


    private void grow(int newLength) {
        String[] newArray = new String[newLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    private void isOutOfBound(int index) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Incorrect index entry");
        }
    }

    private boolean delete(int index) {
        if (index > count || index < 0) {
            return false;
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[count] = null;
        }
        count--;
        return true;
    }
}