package Lesson8;

public class Test {

    public static void main(String[] args) {



    CollectionImpl collection=new CollectionImpl();
        collection.add("Privet");
        collection.add("Privet");
        collection.add("Poka");
        collection.add("Hi");
        collection.add("Hello");
        collection.add("Bye");
        System.out.println(collection.get(0).equals(collection.get(1)));
        System.out.println(collection.get(0));
        collection.add(4, "What's up");
        collection.delete("Bye");
        System.out.println(collection.contain(null));
        System.out.println(collection.contain("What's up"));
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
    }
}
