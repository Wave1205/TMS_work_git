package Lesson4_Hometask;

import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args){
        calculating();
    }
    //Найти индексы минимального и максимального элементов и вывести в консоль.
    //Zad2_3
  public static void calculating(){
      System.out.println("Input quantity elements of massive: ");
      Scanner scanner = new Scanner(System.in);
      int masLength = scanner.nextInt();
      int[] masDouble = new int[masLength];
      for (int i = 0; i <= masLength-1; i++){
          System.out.println("Input " + i + " element massive: ");
          masDouble[i] = scanner.nextInt();
      }
    System.out.println("Direct order of masDouble values: ");
    for (int i = 0; i <= masDouble.length-1; i++){
      System.out.print(masDouble[i] + "  ");
    }
    int max = masDouble[0];
    int min = masDouble[0];
    int maxIndex = 0;
    int minIndex = 0;
    for (int i = 1; i <= masDouble.length-1; i++){
      if (masDouble[i] >= max){
        max = masDouble[i];
        maxIndex = i;
      }
      if (masDouble[i] <= min){
        min = masDouble[i];
        minIndex = i;
      }
    }
    System.out.println();
    System.out.println("Max index : " + maxIndex);
    System.out.println("Min index : " + minIndex);
  }
}
