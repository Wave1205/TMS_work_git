package Lesson3_Hometask;
import java.util.*;

public class Zad1_1 {
    public static void main(String[] args) {
        calculating();
    }
    //Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа вывести в
    //консоль соответствующую пору года по номеру месяца. При решении использовать
    //switch.

    public static void calculating(){
        System.out.println("Give me number!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
        }
    }

  /*public static void calculating(){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    switch(a){
      case (1):
        System.out.println("January");
        break;
      case (2):
        System.out.println("February");
        break;
      case (3):
        System.out.println("March");
        break;
      case (4):
        System.out.println("April");
        break;
      case (5):
        System.out.println("May");
        break;
      case (6):
        System.out.println("June");
        break;
      case (7):
        System.out.println("July");
        break;
      case (8):
        System.out.println("August");
        break;
      case (9):
        System.out.println("September");
        break;
      case (10):
        System.out.println("October");
        break;
      case (11):
        System.out.println("November");
        break;
      case (12):
        System.out.println("December");
        break;
      default:
        System.out.println("Number not suit conditions");
    }
  }*/

}
