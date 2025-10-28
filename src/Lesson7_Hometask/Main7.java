package Lesson7_Hometask;
    //Создать класс Build с одним полем type. Создать 2-х наследников этого класса – House и
    //Garage, в которых при создании в конструкторе будет присваиваться в поле type значения
    //“House” и “Garage” соответственно. В методе main другого класса создать объекты House
    //и Garage классов. Продемонстрировать значения полей этих классов используя геттеры.
public class Main7 {
    public static void main(String[] args) {
        //Leson_7_1_Zad_1                             //Output:
        Build build = new Build();
        build.getType();                              //This is Build

        House house = new House();
        house.getTypeOfHouse();                       //This is House

        Build house1 = new House();
        house1.getType();                             //This is House   //Если взять метод getTypeOfHouse()
                                                                        // выведет ошибку, то есть функционал
        Garage garage = new Garage();                                   //Build, а объект является "типа" House
        garage.getTypeOfGarage();                     //This is Garage
    }
}
