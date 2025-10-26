package Lesson6_Hometask;

    //Создать класс Calculator с полями weight, cost, color и заполнить их. И методами
    //нахождения суммы, разности, деления, умножения двух чисел. Метод main в этом классе
    //не создавать !
public class Calculator {
    double weight = 60.5;
    double cost = 100.01;
    String color = "Gold";

        //Сумма
    public static double sum(double a, double b) {
        return a + b;
    }
        //Разность - difference
    public static double diff(double a, double b) {
        return a - b;
    }
        //Умножение - multiplication, times
    public static double times(double a, double b) {
        return a * b;
    }
        //Деление - division, divided by
    public static double div(double a, double b) {
        return a / b;
    }

    public Calculator() {

    }
}
