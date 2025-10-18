package Lesson4_Hometask;

import java.util.Scanner;

public class Zad2_4 {
    public static void main(String[] args) {
        calculating();
    }
    //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    //сообщение, что их нет.
    //Zad2_4
  public static void calculating(){
      System.out.println("Input quantity elements of massive: ");
      Scanner scanner = new Scanner(System.in);
      int masLength = scanner.nextInt();
      int[] masDouble = new int[masLength];
      for (int i = 0; i <= masLength-1; i++){
          System.out.println("Input " + i + " element massive: ");
          masDouble[i] = scanner.nextInt();
      }
    int nullValues = 0;
    for (int i = 0; i <= masDouble.length-1; i++){
      if (masDouble[i] == 0){
        nullValues++;
      }
    }
    System.out.println();
    if (nullValues == 0) {
      System.out.println("There's no nulls...");
    } else {System.out.println("quantity of nulls : " + nullValues);}
  }
}
