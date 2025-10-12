package Lesson1_Hometask;

public class Zad2_2 {
    public static void main(String[] arg){
        //В переменной n хранится двузначное число. Создайте программу, вычисляющую и
        //выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
        //(2+6).
        calculation();
    }

    public static void calculation(){
        int n=34;
        int a=n/10;
        int b=n-a*10;
        int c=a+b;
        System.out.println(c);
    }
}
