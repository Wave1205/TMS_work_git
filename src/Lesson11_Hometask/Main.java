package Lesson11_Hometask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zad1_1
        String str1 = "Hello ", str2 = "world!", str3 = "Hello ",
                str4 = "hello ", str5 = " world!", str6 = "", str7 = "world1";

        //1.1 Объединить 2 строки в одну 2-мя способами.
        //concat()
        System.out.println("concat(): " + str1.concat(str2));
        // +
        System.out.println("+: " + str1 + str2);

        //1.2 Проверить 2 строки на равенство с и без учета регистра.
        //equals()
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        //equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));

        //1.3 Вернуть подстроку с 3-го символа до конца.
        //substring( , )
        System.out.println("substring( , ): " + str1.substring(2,6));

        //1.4 Вывести длину строки
        //length()
        System.out.println("length(): " + str1.length());

        //1.5 Вывести порядковый номер любого символа в строке.
        //indexOf()
        System.out.println("indexOf(): " + str1.indexOf("e"));

        //1.6 Преобразовать логический тип true к строке.
        // +
        System.out.println(" + : " + true + "!");
        //Boolean.toString()
        System.out.println("Boolean.toString: " + Boolean.toString(true));

        //1.7 Перевести строку в верхний регистр.
        //toUpperCase()
        System.out.println("toUpperCase(): " + str1.toUpperCase());

        //1.8 Заменить ‘1’ в строке на ‘%’.
        //replace()
        System.out.println("replace(): " + str7.replace("1", "%"));

        //1.9 Убрать все пробелы в строке с двух сторон.
        //trim()
        System.out.println("trim(): " + str1.trim() + str5.trim());

        //1.10 Проверить, пустая ли строка.
        //isEmpty()
        System.out.println("isEmpty(): " + str1.isEmpty());
        System.out.println("isEmpty(): " + str6.isEmpty());

        //1.11 Разбить строку на несколько по делителю.
        //split()
        String[] words = str1.split("e");
        for (String word : words) {
            System.out.println(word);
        }

        //Zad1_2
        //2.1 Создать объект StringBuilder c любой строкой.
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        //2.2 Добавить к строке “xxxx”.
        str.append("xxxx");
        System.out.println(str);
        //2.3 В 5-ю позицию вставить “y”.
        str.insert(4, "y");
        System.out.println(str);
        //2.4 Удалить символы с 3 по 6.
        str.delete(2, 5);
        System.out.println(str);
        //2.5 Перевернуть строку.
        str.reverse();
        System.out.println(str);
        //2.6 Преобразовать в String и вывести в консоль.
        System.out.println(str.toString());

        //Zad2_1
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[3];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.next();
        }

        for (String input : inputs) {
            System.out.println(input);
        }

        //Zad2_1_1
        //1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        //найденные строки и их длину.
        String min = inputs[0];
        String max = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            if (inputs[i].length() > max.length()) {
                max = inputs[i];
            }
            if (inputs[i].length() < min.length()) {
                min = inputs[i];
            }
        }

        System.out.println("Min: " + min + " , length: " + min.length());
        System.out.println("Max: " + max + " , length: " + max.length());

        //Zad2_1_2
        //2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
        //значений их длины.
        for (int i = 0; i < inputs.length - 1; i++) {
            for (int j = 1; j < inputs.length; j++) {
                if (inputs[i].length() > inputs[j].length()) {
                    String t = inputs[i];
                    inputs[i] = inputs[j];
                    inputs[j] = t;
                }
            }
        }

        for (String input : inputs) {
            System.out.println(input);
        }

        //Zad2_1_3
        //3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        //средней, а также их длину.
        double average = 0;
        for (int i = 0; i < inputs.length; i++) {
            average += inputs[i].length();
        }
        average = average / inputs.length;

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].length() < average) {
                System.out.println("< " + average + ": " + inputs[i] + ", length: " + inputs[i].length());
            }
        }
    }
}
