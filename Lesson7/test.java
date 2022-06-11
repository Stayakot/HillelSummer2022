package Lesson7;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        MyArrayList<String>  myArrayList =new MyArrayList<>();
        myArrayList.add("poka");
        myArrayList.add("kino");
        myArrayList.add("privet");
        myArrayList.add(0,"asf");
        myArrayList.delete("kino");
        myArrayList.delete(2);
        System.out.println(myArrayList.toString());
    }
}
