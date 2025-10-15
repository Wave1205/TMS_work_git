package Lesson4_Hometask;
import java.util.*;
//Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
public class Zad2_1 {
    public static void main(String[] args) {
        //Random random = new Random();                           //Should be removed!!!
        System.out.println("Give me length of massiv!");
        Scanner scanner = new Scanner(System.in);
        int masLength = scanner.nextInt();
        //int[] masInt = new int[masLength];
        double[] masDouble = new double[masLength];
        for (int i = 0; i <= masLength-1; i++){                 //Should be removed!!!
            masDouble[i] = Math.random();
            //masInt[i] = random.nextInt();                         //Should be removed!!!
        }                                                       //Should be removed!!!
        //for (int i = 0; i < masLength; i++) {
        //System.out.println("Give me " + i + " of massiv!");
        //Scanner scanner1 = new Scanner(System.in);
        //masInt[i] = scanner1.nextInt();
        //}
        System.out.println();
        System.out.println("Direct order of masInt values: ");
        for (int i = 0; i <= masLength-1; i++){
            System.out.print(masDouble[i] + "  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Backward order of masDouble values: ");
        for (int i = masLength-1; i >= 0; i--){
            System.out.print(masDouble[i] + "  ");
        }

    }
}
