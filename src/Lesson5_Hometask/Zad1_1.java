package Lesson5_Hometask;
import java.util.Scanner;
import java.util.Random;
public class Zad1_1 {
    public static void main(String[] args) {
        calculating();
    }
    //1.1 Создайте двумерный массив и заполните его псевдослучайными числами с помощью
    //класса Random.
    //1.2 Найдите максимальное значение в созданном 2-мерном массиве.
    public static void calculating(){
    System.out.println("Give me quantity of rows: ");
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();
    System.out.println("Give me quantity of columns: ");
    int columns = scanner.nextInt();
    //int[][] masInt = new int[3][4];
    int[][] masInt = new int[rows][columns];
    Random random = new Random();
    System.out.println();
    for (int i = 0; i <= masInt.length-1; i++) {
      for (int j = 0; j <= masInt[i].length-1; j++) {
        masInt[i][j] = random.nextInt(100);
      }
    }
    for (int i = 0; i <= masInt.length-1; i++) {
      for (int j = 0; j <= masInt[i].length-1; j++) {
        System.out.print(masInt[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    int max = masInt[0][0];
    for (int i = 0; i <= masInt.length-1; i++) {
      for (int j = 0; j <= masInt[i].length-1; j++) {
        if (masInt[i][j] > max) {
        max = masInt[i][j];
        }
      }
    }
    System.out.print("Max element: " + max);
  }
}
