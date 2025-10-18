package Lesson4_Hometask;

import java.util.Scanner;

public class Zad2_5 {
    public static void main(String[] args) {
        calculating();
    }
    //Zad2_5 done with help of Daria
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
    System.out.println();
    for (int i = 0; i <= (masDouble.length-1)/2; i++){
      int t = masDouble[i];
      masDouble[i] = masDouble[masDouble.length - i - 1];
      masDouble[masDouble.length - i - 1] = t;
    }
    System.out.println();
    System.out.println("Backward order of masDouble values: ");
    for (int i = 0; i <= masDouble.length-1; i++){
      System.out.print(masDouble[i] + "  ");
    }
  }
}
