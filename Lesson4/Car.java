package Lesson4;

public class Car {
    double volume;
    double remainFuel;
    double consumption100km;
    double requiredToBunker;
    double requiredFuel;

    public Car(double volume, double remainFuel, double consumption100km) {
        this.volume = volume;
        this.remainFuel = remainFuel;
        this.consumption100km = consumption100km;
    }

    public void fullVolume(){
        if (remainFuel<volume){
            double bunker=volume-remainFuel;
            remainFuel+=bunker;
            System.out.println("Для полного бака нужно залить: "+bunker);
            System.out.println("Количество топлива после заправки: " + remainFuel + " лтр.");
        }
    }

    public void remainFuelDuringDistance(double distance){
        double consumption = distance/100*consumption100km;
        System.out.println("Расход за " + distance+ "км. :" + consumption+ " лтр.");
        remainFuel-=consumption;
        System.out.println("Остаток: "+ remainFuel);

    }

    public void requiredFuelForDistance(double distance){
        requiredFuel=distance/100*consumption100km;
        requiredToBunker = requiredFuel-remainFuel;
        System.out.println("Для преодоленния " + distance + " км."+ " Понадобится: " + requiredFuel + " лтр. топлива");
        System.out.println("Дозаправить нужно: " + requiredToBunker+ " лтр.");

    }

}

class Main{
    public static void main(String[] args) {

        Car car = new Car(30, 29.5, 15);
        car.requiredFuelForDistance(481);
        double price=Integer.parseInt(args[0])*car.requiredToBunker;
        double totalPrice=Integer.parseInt(args[0])*car.requiredFuel;
        System.out.println("Cтоимость топлива что нужно дозаправить по маршруту Одесса-Киев: " + price);
        System.out.println("Общая стоимость поездки по маршруту Одесса-Киев: " + totalPrice);
        car.remainFuelDuringDistance(178);
        System.out.println("Остаток топлива на  Кривое Озеро: " + car.remainFuel);
        car.fullVolume();
        car.remainFuelDuringDistance(155);
        System.out.println("Остаток топлива на  Жашков: " + car.remainFuel);
        car.fullVolume();
        car.remainFuelDuringDistance(148);
        System.out.println("Остаток топлива на  Киев: " + car.remainFuel);


    }
}
