package Lesson6;

public class Subsctibers {
    public static void main(String[] args) {


        Subscriber Misha = new Subscriber(9, "Misha", "Muron", "Nataliev", 1995, "Odesa", "568684868", 1010, -120, 60, 15, 5);
        Subscriber Petya = new Subscriber(10, "Petya", "Petrov", "Petrovovich", 1990, "Lviv", "26569968", 1011, 1000, 10, 0, 4);
        Subscriber Olya = new Subscriber(8, "Olya", "Klevna", "Mihailovna", 1996, "Odesa", "5564648", 1012, 2350, 50, 10, 5);
        Subscriber Katya = new Subscriber(7, "Katya", "Korovna", "Bukova", 1991, "Kiev", "5651575", 1013, -4, 505, 110, 6);
        Subscriber Alena = new Subscriber(6, "Alena", "Popova", "Kirova", 1994, "Lviv", "5646546804", 1014, 4520, 100, 0, 7);
        Subscriber Kostya = new Subscriber(5, "Kostya", "Rubin", "Alexceev", 1996, "Odesa", "3584890", 1015, 1482, 300, 0, 5);
        Subscriber Vlad = new Subscriber(4, "Vlad", "Slyvka", "Olegovych", 1993, "Odesa", "35489080", 1016, -1145, 50, 15, 20);
        Subscriber Sasha = new Subscriber(3, "Sasha", "Korankov", "Mishuta", 1995, "Kiev", "1541656486", 1017, 2581, 18, 70, 5);
        Subscriber Oleg = new Subscriber(2, "Oleg", "Polets", "Konstantinovich", 1995, "Odesa", "380921535", 1018, 3582, 20, 18, 30);
        Subscriber Kristina = new Subscriber(1, "Kristina", "Spivak", "Alexandrovna", 1994, "Odesa", "+38095543", 1019, 3475, 77, 15, 20);

        Subscriber[] subscribers = new Subscriber[10];

        subscribers[0] = Misha;
        subscribers[1] = Petya;
        subscribers[2] = Olya;
        subscribers[3] = Katya;
        subscribers[4] = Alena;
        subscribers[5] = Kostya;
        subscribers[6] = Vlad;
        subscribers[7] = Sasha;
        subscribers[8] = Oleg;
        subscribers[9] = Kristina;


        SubscriberServiceImpl.localTime(subscribers, 20);
        System.out.println();
        SubscriberServiceImpl.international(subscribers);
        System.out.println();
        SubscriberServiceImpl.firstLetter(subscribers, 'S');
        System.out.println();
        SubscriberServiceImpl.internetTriffic(subscribers, "Odesa");
        System.out.println();
        SubscriberServiceImpl.balance(subscribers);
    }
}