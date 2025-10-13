package Lesson1_Hometask;

public class Zad2_star {
    public static void main(String[] args){
        calculating();
    }
    //Написать программу которая будет менять местами значение целочисленных
    //переменных. Пример:
    //int a = 1; int b = 2;
    ////код (ваше решение)
    //sout(a); //выведет 2
    //sout(b); //выведет 1
    //Усовершенствовать программу, использовать только 2 входные переменные (a,b);
    public static void calculating(){
        int a = 1;
        int b = 2;
        System.out.println("start a = " + a + ", start b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("finish a = " + a + ", finish b = " + b);
    }
}
