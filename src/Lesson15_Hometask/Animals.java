package Lesson15_Hometask;
import java.util.LinkedList;
//import java.util.List;

//Zad2_2
//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//объекта этого класса в main методе другого класса.

public class Animals {

    private final LinkedList<String> animals = new LinkedList<>();

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void removeAnimal() {
        animals.removeLast();
    }

    public LinkedList<String> getAnimals(){
        return animals;
    }

}
