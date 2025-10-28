package Lesson6_Hometask;

public class Zad1_2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        person1.talk("*****");

        Person person2 = new Person("Sveta", 34);
        person2.move();
        person2.talk("like an angel");
    }
}
