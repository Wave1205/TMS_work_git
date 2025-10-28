package Lesson6_Hometask;

    //Создать класс Calculator с полями weight, cost, color и заполнить их. И методами
    //нахождения суммы, разности, деления, умножения двух чисел. Метод main в этом классе
    //не создавать !
public class Calculator {

    public double weight = 60.5;
    public double cost = 100.01;
    public String color = "Gold";

        public Calculator() {

        }

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
    //Создать конструктор для класса Calculator, чтобы иметь возможность
    //инициализировать поля в момент создания объекта. Также в логическом блоке добавить
    //вывод в консоль, создаётся объект Calculator.
    public Calculator (double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public void print() {
        System.out.println("weight " + weight + " cost " + cost + " color " + color);
    }
}
