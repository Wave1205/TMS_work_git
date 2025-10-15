package Lesson3_Hometask;

    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
public class Zad2_4 {
    public static void main(String[] args) {
        int seven = 7;
        int i = 1;
        while (i <= 14) {
            System.out.print(seven * i + " ");
            //System.out.println(seven + " * " + i + " = " + seven * i);
            i++;
            }
        }
    }
