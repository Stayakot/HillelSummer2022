package Lesson6;

public interface SubscriberService {


    //сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    void localTime(Subscriber[] subscribers, int localTime) ;


    //сведения об абонентах, которые пользовались междугородней связью;
      void international(Subscriber[] subscribers) ;


    //сведения об абонентах ФИО, номер телефона, баланс у который первая буква фамилии передается как параметр.
     void firstLetter(Subscriber[] subscribers, char firstLetter) ;


    // суммарное потребление трафика интернета для определенного города
      void internetTriffic(Subscriber[] subscribers, String city) ;


    //количество абонентов с отрицательны балансом
    void balance(Subscriber[] subscribers) ;

}
