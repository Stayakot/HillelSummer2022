package Lesson8;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();

        list.add("one");
        list.add("one");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.delete("seven");
        System.out.println(list.get(0).equals("one"));
        System.out.println(list.toString());
    }
}
