package Lesson4_Hometask;
    //Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль.
public class Zad1_1 {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++){
            double a = Math.random();
            System.out.println(a*a);
        }
    }
}
