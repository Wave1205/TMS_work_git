package Lesson1_Hometask;

public class Zad2_1 {
    public static void main(String[] arg){
        calculation();
    }
    //Написать приложение, которое будет вычислять и выводить значение по формуле:
    //a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
    public static void calculation(){
        int b =2;
        int c =1;
        float a;
        a=4*(b+c-1)/2;

        System.out.println(a);
    }
}
