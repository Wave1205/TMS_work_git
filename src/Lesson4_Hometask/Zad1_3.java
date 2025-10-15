package Lesson4_Hometask;
import java.util.*;

//3.1 Создать пустой массив типа double с названием masDouble такого размера, который
//пользователь вводит с клавиатуры.
//3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
//консоль.
//3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
//обратном порядке.
public class Zad1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] masDouble = new double[n];
        System.out.println("Start masDouble values: ");
        for (int i = 0; i <= n-1; i++){
            masDouble[i] = Math.random();
            System.out.print(masDouble[i] + "  ");
        }
        System.out.println();
        System.out.println("Direct squared order of masDouble values: ");
        for (int i = 0; i <= n-1; i++){
            if (i % 2 != 0) {System.out.print(masDouble[i]*masDouble[i] + "  ");}
            else {System.out.print(masDouble[i] + "  ");}
        }
        System.out.println();
        System.out.println("Backward squared order of masDouble values: ");
        for (int i = n-1; i >= 0; i--){
            if (i % 2 != 0) {System.out.print(masDouble[i]*masDouble[i] + "  ");}
            else {System.out.print(masDouble[i] + "  ");}
        }

    }
}
