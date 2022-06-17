package Lesson9;

public class test {
    public static void main(String[] args) {


        CustomCollectionImpl collection = new CustomCollectionImpl();
        CustomCollectionImpl collection2 = new CustomCollectionImpl();
        collection.add("Privet");
        collection.add("Hello");
        collection.add("ChtoKak?");
        collection.add("Normalno,kakSam?");
        collection.add("Vse Rabotaet?");
        collection.add("VrodeRabotaeyr");
        collection.add("Ny Ok");
        collection.add("Bedem togda otpravlat?");
        collection2.add("Da,Davay Otpravim");
        collection2.add("Davay togda,Poka");
        collection2.add("Poka");
        System.out.println(collection.get(1));
        System.out.println(collection.size());
        System.out.println(collection.contains("VrodeRabotaeyr"));
        collection.delete("VrodeRabotaeyr");
        System.out.println(collection.contains("ChtoKak?"));
        collection.addAll(collection2);
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());
    }
}
