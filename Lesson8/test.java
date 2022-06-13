package Lesson8;


public class test {
    public static void main(String[] args) {
        MyArrayListImpl<String>myArrayList=new MyArrayListImpl<>();

        myArrayList.add("poka");
        myArrayList.add("kino");
        myArrayList.add("kino");
        myArrayList.add("privet");
        myArrayList.add("kino");


        System.out.println(myArrayList.contain("poka"));
        System.out.println(myArrayList.get(1).equals(myArrayList.get(2)));

    }

}
