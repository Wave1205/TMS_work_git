package Lesson5_Hometask;
import java.util.Scanner;

public class Zad2_star {
    public static void main(String[] args) {
        calculating();
    }
    //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
    //Формат входных данных:
    //Программа получает на вход два числа n и m.
    //Формат выходных данных:
    //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    //символа.
    public static void calculating(){
        System.out.println("Give me quantity of rows: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Give me quantity of columns: ");
        int columns = scanner.nextInt();
        int[][] masInt = new int[rows][columns];
        System.out.println();
        int s = 0;
        for (int i = 0; i <= masInt.length-1; i++) {
            if (i % 2 != 0) {
                for (int j = masInt[i].length-1; j >= 0; j--) {
                    masInt[i][j] = s;
                    s++;
                }
            } else {
                for (int j = 0; j <= masInt[i].length-1; j++) {
                    masInt[i][j] = s;
                    s++;
                }
            }
        }
        for (int i = 0; i <= masInt.length-1; i++) {
            for (int j = 0; j <= masInt[i].length-1; j++) {
                if (masInt[i][j] < 10) {
                    System.out.print("  " + masInt[i][j]);
                } else if (masInt[i][j] > 9 && masInt[i][j] < 100) {
                    System.out.print(" " + masInt[i][j]);
                } else {
                    System.out.print(masInt[i][j]);
                }
            }
            System.out.println();
        }
    }
}
