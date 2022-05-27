package Lesson3;

public class tenNumbersMinus5 {


    public static void main(String[] args) {
        System.out.println("Вывести 10 первых чисел последовательности 0, -5,-10,-15..");
        int number = 0;
        for (int i=0;i<10;i++){
            System.out.print(number+" ");
            number-=5;
        }
    }
}
