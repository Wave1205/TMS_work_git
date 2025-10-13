package Lesson1_Hometask;

public class Zad2_4 {
    public static void main(String[] args){
        calculating();
    }
    //В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
    //программу, округляющую число n до ближайшего целого и выводящую результат на
    //экран.
    public static void calculating(){
        double n = 6.4;
        long d = (long) n;
        long x = (n-d >= 0.5) ? d += 1 : d;
        System.out.println(x);
    }
}
