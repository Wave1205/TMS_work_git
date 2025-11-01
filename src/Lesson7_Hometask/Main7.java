package Lesson7_Hometask;

public class Main7 {
    public static void main(String[] args) {
        //Leson_7_1_Zad_1
        //Создать класс Build с одним полем type. Создать 2-х наследников этого класса – House и
        //Garage, в которых при создании в конструкторе будет присваиваться в поле type значения
        //“House” и “Garage” соответственно. В методе main другого класса создать объекты House
        //и Garage классов. Продемонстрировать значения полей этих классов используя геттеры.
        Build build = new Build();                    //Output:
        build.getType();                              //This is Build

        House house = new House();
        house.getTypeOfHouse();                       //This is House

        Build house1 = new House();
        house1.getType();                             //This is House   //Если взять метод getTypeOfHouse()
                                                                        // выведет ошибку, то есть функционал
        Garage garage = new Garage();                                   //Build, а объект является "типа" House
        garage.getTypeOfGarage();                     //This is Garage

        //Leson_7_1_Zad_2
        //Создать класс Person с полями name, age, gender. Поле name сделать public, age
        //оставить по дефолту, gender – private. В классе Main создать объект Person.
        //Предположить какие поля мы увидим. Продемонстрировать значения полей объекта
        //используя геттеры и поля если это возможно.

        Person person1 = new Person("Steve", 56, "M");
        person1.getName();
        person1.getAge();
        //person1.getGender;                                  //Нельзя достать
        person1.getAll();

        System.out.println(person1.fullname);
        System.out.println(person1.age);
        //System.out.println(person1.gender);                 //Нельзя достать

        //Leson_7_2_Zad_1
        //Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
        //хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
        //по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
        //«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
        //терапевта создать метод, который будет назначать врача пациенту согласно плану
        //лечения:
        //Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
        //Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
        //Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
        //лечить.
        Patient patient = new Patient(1);
        System.out.println(patient.doctor + "  " + patient.planOfHealing);
        Therapist therapist = new Therapist();
        patient.doctor = therapist.appointment(patient.planOfHealing);
        System.out.println(patient.doctor + "  " + patient.planOfHealing);

        //Leson_7_2_Zad_star
        //Создать класс Apple и добавить в него поле color с модификатором доступа private и
        //инициализировать его. В методе main другого класса создать объект Apple, и не
        //используя сеттеры изменить значение поля color.
        Apple apple = new Apple();
        //apple.color = "Golden";
        //System.out.println(apple.color);
    }
}
