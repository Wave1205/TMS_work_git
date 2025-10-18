package Lesson4_Hometask;

import java.util.Scanner;

public class Zad2_6 {
    public static void main(String[] args) {
        calculating();
    }
    //Zad2_6 done, блядские = и ==
    public static void calculating(){
        System.out.println("Input quantity elements of massive: ");
        Scanner scanner = new Scanner(System.in);
        int masLength = scanner.nextInt();
        int[] masDouble = new int[masLength];
        for (int i = 0; i <= masLength-1; i++){
            System.out.println("Input " + i + " element massive: ");
            masDouble[i] = scanner.nextInt();
        }
        Boolean isExist = false;
        int element = masDouble[0];
        for (int i = 1; i <= masDouble.length-1; i++){

            if (masDouble[i] > element){
                element = masDouble[i];
                isExist = true;
            } else {
                isExist = false;
                break;
            }
        }
        System.out.println();
        if (isExist == false) {
            System.out.println("It's not raising massive...");
        } else {System.out.println("It's raising massive!");}
    }
}
