package Lesson2;


public class DepositCalculator {
    public static void main(String[] args) {
        double value = Integer.parseInt(args[0]);
        double percent = Integer.parseInt(args[1]) / 100.0;
        int year = Integer.parseInt(args[2]);

        for (int i = 0; i < year; i++) {
            double percentPerYear = value * percent;
            value += percentPerYear;
            System.out.println("Начисленные проценты за год: " + percentPerYear);
            System.out.println("Накопительная сумма за год: " + value);

        }

    }
}

