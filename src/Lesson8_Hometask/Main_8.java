package Lesson8_Hometask;

import static Lesson8_Hometask.Person.*;

public class Main_8 {
    public static void main(String[] args) {
        //Реализовать иерархию, показанную ниже, переопределить методы draw и erase в каждом
        //из классов так, чтобы он выводил “I draw ”+ имя класса и “I erase ” + имя класса. Показать
        //работу каждого из методов в main другого класса.
        Shape shape = new Shape();
        shape.draw();

        Shape triangle1 = new Triangle();
        triangle1.erase();

        Triangle triangle = new Triangle();
        triangle.draw();
        //Создать класс Person. Написать статическое финальное поле name и статический метод,
        //который выводит его имя в консоль. Реализовать в методе main другого класса вызов
        //поля и метода не создавая объекта класса Person.
        print();
        System.out.println(name);


    }
}
