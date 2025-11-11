package Lesson9_Hometask;

public class Main9 {
    public static void main(String[] args) {
        //1.1 Создать классы Dog, Cat, Main и интерфейс Voice c методом doVoice().
        //1.2 В Dog и Cat имплементировать данный интерфейс и реализовать метод doVoice().
        //1.3 В классе Main создать объекты Dog, Cat и вызвать метод doVoice().
        //Lesson_9_Zad_1_1
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.doVoice();
        dog.doVoice();

        //Создать абстрактный класс Computer и абстрактный метод getClassName(). Создать
        //классы Hp и Mac и отнаследоваться от Computer. Переопределить метод getClassName()
        //в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Mac». В
        //методе main класса Main создать объекты классов Hp Mac и вызвать методы для каждого
        //из этих объектов.
        //Lesson_9_Zad_1_2
        Computer computer = new Mac();              //О как!!!
        Hp hp = new Hp();
        Mac mac = new Mac();

        computer.getClassName();                    //О как!!!
        hp.getClassName();
        mac.getClassName();

        //Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        //который печатает название должности и имплементировать этот метод в созданные
        //классы.
        //Lesson_9_Zad_2_1
        Director director = new Director();
        director.printPosition();
        Worker worker = new Worker();
        worker.printPosition();

        //Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        //функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        //абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        //периметра всех фигур в массиве.
        //Lesson_9_Zad_2_2


    }


}
