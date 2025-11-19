package Lesson12_Hometask;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {

    public static void main(String[] args) {

        String input = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        String inputNull = "";
        String inputN = "Hello \\n world \\n !!!";
        String inputGates = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";

        //1
        numbers(input);
        //2
        replace(input);
        //3
        insta(input);
        //4
        //findNull(input);             //undone
        //5
        replaceN(inputN);               //undone

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
  /*public static void findNull(String str) {
    Pattern pattern = Pattern.compile("\\W");
    Matcher matcher = pattern.matcher(str);              //need to think about it more!!!!!!!
    //while (matcher.find())
    System.out.println(matcher.find());
  }*/

    //5. В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
    public static void replaceN(String text) {
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(text);              //need to think about it more!!!!!!!
        System.out.println(matcher.replaceAll(""));
    }

    //6. В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!”
    //найти имя и фамилию человека и вывести на экран!
}
