package Lesson6;

public interface SubscriberService {


    //сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    void subscriberUsedLocalCall(Subscriber[] subscribers, int localTime) ;


    //сведения об абонентах, которые пользовались междугородней связью;
      void subscriberUsedInternationalCall(Subscriber[] subscribers) ;


    //сведения об абонентах ФИО, номер телефона, баланс у который первая буква фамилии передается как параметр.
     void subscribersWithFirstLetterParameter(Subscriber[] subscribers, char firstLetter) ;


    // суммарное потребление трафика интернета для определенного города
      int sumOfInternetTrafficForCity(Subscriber[] subscribers, String city);


    //количество абонентов с отрицательны балансом
    int subscribersWithMinusBalance(Subscriber[] subscribers) ;

}
