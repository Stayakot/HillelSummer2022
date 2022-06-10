package Lesson7;

public class test {
    public static void main(String[] args) {


        MyArrayList<String>  myArrayList =new MyArrayList<>();
        myArrayList.add(2,"poka");
        myArrayList.add("kino");
        myArrayList.add(0,"asf");
        myArrayList.delete("kino");
        myArrayList.add("kino");
        myArrayList.add(3,"poka");
        myArrayList.delete(3);
        myArrayList.add(8,"asf");
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList);
    }

}
