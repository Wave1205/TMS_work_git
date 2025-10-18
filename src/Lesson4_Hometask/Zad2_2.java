package Lesson4_Hometask;
import java.util.Scanner;
    //Найти минимальный-максимальный элементы и вывести в консоль.
public class Zad2_2 {
    public static void main(String[] args) {
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
        int max = masDouble[0];
        int min = masDouble[0];
        for (int i = 1; i <= masDouble.length-1; i++){
            if (masDouble[i] >= max){
                max = masDouble[i];
            }
            if (masDouble[i] <= min){
                min = masDouble[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
