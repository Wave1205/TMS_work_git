package Lesson12_Hometask;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String input = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        String inputNull = "";
        String inputN = "Hello \n world \n !!!";
        String inputGates = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";

        //1
        numbers(input);
        //2
        replace(input);
        //3
        insta(input);
        //4
        findNull(inputNull);
        findNull(input);
        //5
        replaceN(inputN);
        //6
        findFullName(inputGates);
        //2.1
        System.out.println("\nGive string: ");
        Scanner scanner = new Scanner(System.in);
        abc(scanner.nextLine());
    }

    //1. Написать метод который сможет вернуть все цифры из строки:
    //“Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”.
    public static void numbers(String str) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);              //need to think about it more!!!!!!!
        while (matcher.find()) System.out.println(matcher.group());
    }

    //2. Написать метод который сможет заменить КАЖДУЮ букву на знак & в строке из 1
    //задания.
    public static void replace(String text) {
        Pattern pattern = Pattern.compile("[A-Z&a-z]");
        Matcher matcher = pattern.matcher(text);              //need to think about it more!!!!!!!
        System.out.println(matcher.replaceAll("&"));
    }

    //3. Написать метод который сможет вернуть инсту в строке из 1 задания.
    public static void insta(String str) {
        Pattern pattern = Pattern.compile("@(\\w*)");
        Matcher matcher = pattern.matcher(str);              //need to think about it more!!!!!!!
        while (matcher.find()) System.out.println(matcher.group());
    }
    //4. Написать метод который возвращает true если строка имеет вид “null”.
    public static void findNull(String str) {
        Pattern pattern = Pattern.compile("^$");
        Matcher matcher = pattern.matcher(str);              //need to think about it more!!!!!!!
        //while (matcher.find())
        System.out.println(matcher.find());
        //System.out.println("str2 is empty: " + str.matches("^$"));
    }

    //5. В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
    public static void replaceN(String text) {
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(text);              //need to think about it more!!!!!!!
        System.out.println(matcher.replaceAll(""));
    }

    //6. В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!”
    //найти имя и фамилию человека и вывести на экран!
    public static void findFullName(String text) {
        Pattern pattern = Pattern.compile("\\b([A-ZА-Я][a-zа-я]+)\\s+([A-ZА-Я][a-zа-я]+)\\b");
        Matcher matcher = pattern.matcher(text);              //need to think about it more!!!!!!!
        while (matcher.find()) {
            String firstName = matcher.group(1); // Имя
            String lastName = matcher.group(2);  // Фамилия
            System.out.println("Найдено: " + firstName + " " + lastName);
        }
    }

    //Вывести в консоль из строки которую пользователь вводит с клавиатуры все
    //аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
    //только из прописных букв, без чисел.

    //\\b[A-Z]{2,6}\\b
    public static void abc(String str) {
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(str);              //need to think about it more!!!!!!!
        while (matcher.find()) System.out.println(matcher.group());
        //System.out.println(matcher.find());
        //System.out.println(matcher.group());
    }


    //Программа на вход получает произвольный текст. В этом тексте может быть номер
    //документа(один или несколько), емейл и номер телефона. Номер документа в формате:
    //xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
    //может содержать не всю информацию, т.е. например, может не содержать номер
    //телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
    //формате:
    //email: teachmeskills@gmail.com
    //document number: 1423-1512-51
    //и т.д
}
