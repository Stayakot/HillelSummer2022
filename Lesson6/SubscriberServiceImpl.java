package Lesson6;


public class SubscriberServiceImpl implements SubscriberService {


    //сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    @Override
    public void localTime(Subscriber[] subscribers, int localTime) {
        System.out.println("Cведения об абонентах, у которых время внутригородских разговоров превышает заданное ");
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLocalTime() > localTime) {
                System.out.println(subscriber.toString());
            }
        }
        System.out.println();
    }

    //сведения об абонентах, которые пользовались междугородней связью;
    @Override
    public void international(Subscriber[] subscribers) {
        System.out.println("Cведения об абонентах, которые пользовались междугородней связью; ");
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInternational() > 0) {
                System.out.println(subscriber.toString());
            }
        }

    }

    //сведения об абонентах ФИО, номер телефона, баланс у который первая буква фамилии передается как параметр.
    @Override
    public void firstLetter(Subscriber[] subscribers, char firstLetter) {
        System.out.println("Сведения об абонентах ФИО, номер телефона, баланс у который первая буква фамилии передается как параметр.:");
        for (Subscriber subscriber : subscribers) {
            char[] strToArray = subscriber.getSurname().toCharArray();
            if (strToArray[0] == firstLetter) {
                System.out.println(subscriber.getName() + " " + subscriber.getSurname() + " " + subscriber.getMiddleName() + " Telefon number: " + subscriber.getTelNumber() + " Balance: " + subscriber.getBalance());
            }
        }
    }

    // суммарное потребление трафика интернета для определенного города
    @Override
    public int internetTraffic(Subscriber[] subscribers, String city) {
        int sum = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity().equals(city)) {
                sum += subscriber.getInternetTraffic();
            }
        }
        return sum;

    }

    //количество абонентов с отрицательны балансом

    @Override

    public int balance(Subscriber[] subscribers) {
        System.out.println("Количество абонентов с отрицательны балансом:");
        int count=0;

        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                count+=1;
            }
        }return count;


    }


}





