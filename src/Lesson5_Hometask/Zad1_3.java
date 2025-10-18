package Lesson5_Hometask;
import java.util.Scanner;
import java.util.Random;
public class Zad1_3 {
    public static void main(String[] args) {
        calculating();
    }
    //Найдите сумму элементов на главной диагонали:
    public static void calculating(){
        System.out.println("Give me quantity of rows: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Give me quantity of columns: ");
        int columns = scanner.nextInt();

        if (rows == columns) {
            int[][] masInt = new int[rows][columns];
            Random random = new Random();
            System.out.println();
            for (int i = 0; i <= masInt.length-1; i++) {
                for (int j = 0; j <= masInt[i].length-1; j++) {
                    masInt[i][j] = random.nextInt(10);
                }
            }
            for (int i = 0; i <= masInt.length-1; i++) {
                for (int j = 0; j <= masInt[i].length-1; j++) {
                    System.out.print(masInt[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            int sum = 0;
            for (int i = 0; i <= masInt.length-1; i++) {
                for (int j = 0; j <= masInt[i].length-1; j++) {
                    if (i == j) {
                        sum = sum + masInt[i][j];
                    }
                }
            }
            System.out.print("Sum of elements: " + sum);
        } else {System.out.print("It's not squared massive...");}
    }
}
