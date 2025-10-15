package Lesson3_Hometask;
import java.util.*;
    //Напишите программу, которая будет принимать на вход число из консоли и на выход
    //будет выводить сообщение четное число или нет. Для определения четности числа
    //используйте операцию получения остатка от деления (операция выглядит так: '% 2').
public class Zad2_1 {
    public static void main(String[] args) {
        System.out.println("Give me number!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 > 0){System.out.println(a + " - is odd number");}
        else {System.out.println(a + " - is even number");}

    }
}
