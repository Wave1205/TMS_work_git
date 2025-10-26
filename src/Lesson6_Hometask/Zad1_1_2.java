package Lesson6_Hometask;
    //Создать объект класса Calculator в main методе другого класса. Проверить работу
    //методов и вывести в консоль значения полей weight, cost, color.
public class Zad1_1_2 {
    public static void main(String[] args) {
        Calculator check = new Calculator();
        double a = 10; double b = 5;
        System.out.println("Sum of a and b: " + check.sum(a,b));
        System.out.println("Difference of a and b: " + check.diff(a,b));
        System.out.println("Multiplication of a and b: " + check.times(a,b));
        System.out.println("Division of a and b: " + check.div(a,b));
        System.out.println("Weight: " + check.weight + " Cost: " + check.cost + " Color: " + check.color);
    }
}
