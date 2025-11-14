package Lesson8_Hometask;

import static Lesson8_Hometask.Person.*;

public class Main_8 {
    public static void main(String[] args) {
        //Lesson_8_Zad_1_1
        //Реализовать иерархию, показанную ниже, переопределить методы draw и erase в каждом
        //из классов так, чтобы он выводил “I draw ”+ имя класса и “I erase ” + имя класса. Показать
        //работу каждого из методов в main другого класса.
        Shape shape = new Shape();
        shape.draw();

        Shape triangle1 = new Triangle();
        triangle1.erase();

        Triangle triangle = new Triangle();
        triangle.draw();
        //Lesson_8_Zad_1_2
        //Создать класс Person. Написать статическое финальное поле name и статический метод,
        //который выводит его имя в консоль. Реализовать в методе main другого класса вызов
        //поля и метода не создавая объекта класса Person.
        print();
        System.out.println(name);

        //Lesson8_2_1
        //Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
        //Переопределить методы voice(), eat(String food) чтобы они выводили верную
        //информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        //Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
        //туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
        //или другую строку то он будет недоволен.
        Animal animal = new Animal();
        animal.voice();
        animal.eat("Meat");
        animal.eat("Carrot");

        /*Animal dog = new Dog();
        dog.voice();
        dog.eat("Meat");
        dog.eat("Carrot");*/

        Animal rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Carrot");

        Animal tiger = new Tiger();
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Carrot");

        //Lesson8_2_star
        //Написать такой конструктор, который запретит создание объекта класса Dog в других
        //классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
        //обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
        //способа.
        Dog dog = Dog.getDogInstance();
        //Animal dog = new Dog();
        dog.voice();
        dog.eat("Meat");
        dog.eat("Carrot");
    }
}
