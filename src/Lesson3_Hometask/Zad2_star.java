package Lesson3_Hometask;
import java.util.*;
//undone because of online compiler (onecompiler.com)
//have to do proper validation (only have for positive values, but
//not integers)
//done I'm think

    //Напишите программу, где пользователь вводит любое целое положительное число. А
    //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    //ввести некорректные данные.
public class Zad2_star {
    public static void main(String[] args) {
        System.out.println("Give me number!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        if (a > 0) {
            System.out.println("Continue!");
            for (; a > 0;a--){
                sum = sum + a;
            }
            System.out.println(sum);
        }
        else {System.out.println("Value should be positive!");}
    }
}

