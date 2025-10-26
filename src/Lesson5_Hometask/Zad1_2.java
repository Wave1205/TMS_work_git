package Lesson5_Hometask;
import java.util.Random;
public class Zad1_2 {
    public static void main(String[] args) {
        calculating();
    }
    //Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём.
    public static void calculating() {
        Random random = new Random();
        int n = random.nextInt(3,6);
        int[][] masInt = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = random.nextInt(1,10);
            masInt[i] = new int[m];
        }
        int quantity = 0;
        for(int i = 0; i < masInt.length; i++) {
            for (int j = 0; j < masInt[i].length; j++) {
                System.out.print(masInt[i][j] + " ");
                quantity++;
            }
            System.out.println();
        }
        System.out.println("Quantity of elements in massive: " + quantity);
    }
}
