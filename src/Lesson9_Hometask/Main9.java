package Lesson9_Hometask;

public class Main9 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Lesson_9_Zad_1_1
        //1.1 Создать классы Dog, Cat, Main и интерфейс Voice c методом doVoice().
        //1.2 В Dog и Cat имплементировать данный интерфейс и реализовать метод doVoice().
        //1.3 В классе Main создать объекты Dog, Cat и вызвать метод doVoice().
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.doVoice();
        dog.doVoice();

        //Lesson_9_Zad_1_2
        //Создать абстрактный класс Computer и абстрактный метод getClassName(). Создать
        //классы Hp и Mac и отнаследоваться от Computer. Переопределить метод getClassName()
        //в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Mac». В
        //методе main класса Main создать объекты классов Hp Mac и вызвать методы для каждого
        //из этих объектов.
        Computer computer = new Mac();              //О как!!!
        Hp hp = new Hp();
        Mac mac = new Mac();

        computer.getClassName();                    //О как!!!
        hp.getClassName();
        mac.getClassName();

        //Lesson_9_Zad_2_1
        //Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        //который печатает название должности и имплементировать этот метод в созданные
        //классы.
        Director director = new Director();
        director.printPosition();
        Worker worker = new Worker();
        worker.printPosition();

        //Lesson_9_Zad_2_2
        //Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        //функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        //абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        //периметра всех фигур в массиве.
        Circle circle = new Circle(2);
        System.out.println("Perimetr of circle: " + circle.perimeter());          //Correct!
        System.out.println("Square of circle: " + circle.square());               //Correct!

        Square square = new Square(3);
        System.out.println("Perimetr of square: " + square.perimeter());          //Correct!
        System.out.println("Square of square: " + square.square());               //Correct!

        Triangle triangle = new Triangle(2, 3, 4);
        System.out.println("Perimetr of triangle: " + triangle.perimeter());      //Correct!
        System.out.println("Square of triangle: " + triangle.square());           //Correct!

        Shape[] figures = new Shape[5];
        figures[0] = new Circle(2);
        figures[1] = new Circle(2);
        figures[2] = new Square(3);
        figures[3] = new Square(3);
        figures[4] = new Triangle(2, 3, 4);
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += figures[i].perimeter();
        }
        System.out.println("Sum of perimeters of elements in array: " + sum);     //Correct!

        //Lesson_9_Zad_2_star
        //Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
        Family family = new Family("Browns", new House("Flat", 78.5));
        Family clonedFamily = family.clone();
        System.out.println("Original: \t" + family.name + ", " + family.house.type);
        System.out.println("Clone:  \t" + clonedFamily.name + ", " + clonedFamily.house.type);
        System.out.println();
        clonedFamily.name = "Blacks";

        System.out.println("Original + new name: \t" + family.name + ", " + family.house.type);
        System.out.println("Clone + new name: \t" + clonedFamily.name + ", " + clonedFamily.house.type);
        System.out.println();

        House clonedFamilyHouse = clonedFamily.house;
        clonedFamilyHouse.type = "Dacha";

        System.out.println("Original + new type of house: \t" + family.name + ", " + family.house.type);
        System.out.println("Clone + new type of house: \t" + clonedFamily.name + ", " + clonedFamily.house.type);
    }


}
