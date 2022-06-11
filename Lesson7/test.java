package Lesson7;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<String>  myArrayList =new ArrayList<>();
        myArrayList.add("poka");
        myArrayList.add("kino");
        myArrayList.add("asf");
        myArrayList.add("poka");
        myArrayList.add(3,"achto");
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.toString());
    }
}
