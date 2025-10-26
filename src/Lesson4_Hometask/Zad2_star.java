package Lesson4_Hometask;
import java.util.Scanner;
public class Zad2_star {
    public static void main(String[] args) {
        calculating();
    }
    //Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    //содержит нуля в начале, кроме самого числа 0.
    //Пример:
    //Input: [1,4,0,5,6,3]
    //Output: [1,4,0,5,6,4]
    //Input: [9,9,9]
    //Output: [1,0,0,0]
    public static void calculating() {
        System.out.println("Give me quantity of elements: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] masIntValue = new int[n];
        for (int i = 0; i < masIntValue.length; i++) {
            System.out.println("Give me value of element: ");
            masIntValue[i] = scanner.nextInt();
            if (masIntValue[i] < 10 && masIntValue[i] >= 0) {
                if (masIntValue[i] == 0 && i == 0) {
                    System.out.println("First number should not be 0...");
                    return;
                }
            } else {
                System.out.println("Numbers should be < 9 and positive");
                return;
            }
        }
        System.out.println();
        System.out.println("Old order of masIntValue values: ");
        for (int k : masIntValue) {
            System.out.print(k + " ");
        }
        if (masIntValue[masIntValue.length-1] == 9) {
            for (int i = masIntValue.length-1; i >= 0; i--) {
                if (masIntValue[i] == 9) {
                    masIntValue[i] = 0;
                    if (i == 0) {
                        int[] masIntValueNew = new int[masIntValue.length+1];
                        masIntValueNew[0] = 1;
                        for (int r = 1; r < masIntValueNew.length; r++) {
                            masIntValueNew[r] = 0;
                        }
                        System.out.println();
                        System.out.println();
                        System.out.println("New order of masDouble values: ");
                        for (int j : masIntValueNew) {
                            System.out.print(j + " ");
                        }
                        return;
                    }
                } else {
                    masIntValue[i]++;
                    break;
                }
            }
        } else {
            masIntValue[masIntValue.length-1]++;
        }
        System.out.println();
        System.out.println();
        System.out.println("New order of masDouble values: ");
        for (int j : masIntValue) {
            System.out.print(j + " ");
        }
    }
}
