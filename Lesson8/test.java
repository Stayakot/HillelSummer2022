package Lesson8;

public class test {
    public static void main(String[] args) {
        MyArrayListImpl<String> list=new MyArrayListImpl<>();

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
