package Lesson3_Hometask;
import java.util.*;
    //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
public class Zad2_2 {
    public static void main(String[] args) {
        System.out.println("Give me temperature!");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) { System.out.println("Warm");}
        else if (t <= -5 && t > -20) {System.out.println("Normal");}
        else if (t < -20) {System.out.println("Cold");}
        //else {System.out.println("With any other numbers we don't know what to do -/(*_*)/_");} //it's no use
    }
}
