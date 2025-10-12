package Lesson1_Hometask;

public class Zad2_3 {
    public static void main(String[] arg){
        //В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
        //выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
        //9 (1+2+6).
        calculating();
    }

    public static void calculating(){
        int n=345;
        int a=n/100;
        int b=n/10-a*10;
        int c=n-a*100-b*10;
        int d=a+b+c;
        System.out.println(d);
    }
}
