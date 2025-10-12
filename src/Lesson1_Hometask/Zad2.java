package Lesson1_Hometask;

public class Zad2 {
    public static void main(String[] arg) {
        name();
        surname();
        age();
    }
    //Добавить в программу целочисленную переменную с названием age, в которой будет
    //храниться ваш возраст. Вывести в консоли ваше имя, фамилию и возраст.
    public static void name() {
        System.out.println("Rita");
    }

    public static void surname() {
        System.out.println("Osipenko");
    }

    public static void age() {
        int age = 21;
        System.out.println(age);
    }
}
