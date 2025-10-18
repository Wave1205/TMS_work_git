package Lesson5_Hometask;
import java.util.Scanner;
import java.util.Random;
public class Zad2_1 {
    public static void main(String[] args) {
        calculating();
    }
    //1.1 Создать двумерный массив, заполнить его случайными числами.
    //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    public static void calculating(){
        System.out.println("Give me quantity of rows: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        System.out.println("Give me quantity of columns: ");
        int columns = scanner.nextInt();

        System.out.println("Give me number: ");
        int number = scanner.nextInt();

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
                sum = sum + masInt[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);
        System.out.println();

        sum = 0;
        for (int i = 0; i <= masInt.length-1; i++) {
            for (int j = 0; j <= masInt[i].length-1; j++) {
                masInt[i][j] = masInt[i][j] + number;
                sum = sum + masInt[i][j];
            }
        }

        for (int i = 0; i <= masInt.length-1; i++) {
            for (int j = 0; j <= masInt[i].length-1; j++) {
                System.out.print(masInt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Sum of elements: " + sum);
    }
}
