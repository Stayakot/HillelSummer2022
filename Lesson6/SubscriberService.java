package Lesson6;

public interface SubscriberService {


    //сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    void localTime(Subscriber[] subscribers, int localTime) ;

    public  void international(Subscriber[] subscribers) ;

    public  void firstLetter(Subscriber[] subscribers, char firstLetter) ;
    public  void internetTriffic(Subscriber[] subscribers, String city) ;

    public  void balance(Subscriber[] subscribers) ;

}
