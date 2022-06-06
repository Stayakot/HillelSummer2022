package Lesson6;

public class Subscriber {


    private int id;
    private String name;
    private String surname;
    private String middleName;
    private int year;
    private String city;
    private String telNumber;
    private int numberOfContract;
    private int balance;
    private int localTime;
    private int international;

    private int internetTraffic;

    public Subscriber(int id, String name, String surname, String middleName, int year, String city, String telNumber, int numberOfContract, int balance, int localTime, int international, int internetTraffic) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.year = year;
        this.city = city;
        this.telNumber = telNumber;
        this.numberOfContract = numberOfContract;
        this.balance = balance;
        this.localTime = localTime;
        this.international = international;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLocalTime() {
        return localTime;
    }

    public void setLocalTime(int localTime) {
        this.localTime = localTime;
    }

    public int getInternational() {
        return international;
    }

    public void setInternational(int international) {
        this.international = international;
    }


    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", year=" + year +
                ", city='" + city + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", numberOfContract=" + numberOfContract +
                ", balance=" + balance +
                ", localTime=" + localTime +
                ", international=" + international +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}


