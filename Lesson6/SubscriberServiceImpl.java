package Lesson6;


public class SubscriberServiceImpl implements SubscriberService {


    //сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    public static void localTime(Subscriber[] subscribers, int localTime) {
        System.out.println("Cведения об абонентах, у которых время внутригородских разговоров превышает заданное ");
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLocalTime() > localTime) {
                System.out.println(subscriber.toString());
            }
        }
        System.out.println();
    }


//сведения об абонентах, которые пользовались междугородней связью;
    public static void international(Subscriber[] subscribers) {
        System.out.println("Cведения об абонентах, которые пользовались междугородней связью; ");
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInternational() > 0) {
                System.out.println(subscriber.toString());
            }
        }

    }

//сведения об абонентах ФИО, номер телефона, баланс у который первая буква фамилии передается как параметр.
    public static void firstLetter(Subscriber[] subscribers, char firstLetter) {
        System.out.println("Сведения об абонентах ФИО, номер телефона, баланс у который первая буква фамилии передается как параметр.:");
        for (Subscriber subscriber : subscribers) {
            char[] strToArray = subscriber.getSurname().toCharArray();
            if (strToArray[0] == firstLetter) {
                System.out.println(subscriber.getName() + " " + subscriber.getSurname() + " " + subscriber.getMiddleName() + " Telefon number: " + subscriber.getTelNumber() + " Balance: " + subscriber.getBalance());
            }
        }
    }

// суммарное потребление трафика интернета для определенного города
    public static void internetTriffic(Subscriber[] subscribers, String city) {
        int sum = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity().equals(city)) {
                sum += subscriber.getInternetTraffic();
            }
        }
        System.out.println("Cуммарное потребление трафика интернета для города: " + sum);

    }

//количество абонентов с отрицательны балансом
    public static void balance(Subscriber[] subscribers) {
        System.out.println("Количество абонентов с отрицательны балансом:");
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                System.out.println(subscriber.toString());
            }
        }


    }
}




