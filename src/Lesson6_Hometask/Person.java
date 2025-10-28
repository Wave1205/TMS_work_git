package Lesson6_Hometask;
    //2.1 Создать класс Person, который содержит: переменные fullName, age; методы
    //talk(String text) и move(), в которых вывести на консоль сообщение -"*fullName* talk
    //*text*..." и "*fullName* walk.".
    //2.2 Добавьте два конструктора - Person() и Person(fullName, age).
    //2.3 Создайте два объекта этого класса. Один объект инициализируется конструктором
    //Person(), другой - Person(fullName, age). Вызовите методы move() и talk()
public class Person {
    public String fullname;
    public int age;

    public Person () {
        this.fullname = "Maria";
        this.age = 29;
    }

    public Person (String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void move() {
        System.out.println(fullname + " walk(s)");
    }

    public void talk(String phrase) {
        System.out.println(fullname + " talk(s) " + phrase);
    }
}
