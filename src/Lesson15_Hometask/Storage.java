package Lesson15_Hometask;

//Zad1_4
//Создать дженерик класс Storage с полем того типа который передаем в дженерик при
//создании объекта. Сделать конструктор по дефолту и конструктор с этим полем.
//Добавить геттеры/сеттеры. В методе main создать 2 объекта на основе этого дженерика и
//проверить их работу.
public class Storage<T> {
    private T slot;

    Storage() {

    }

    Storage(T slot) {
        this.slot = slot;
    }

    public T getSlot() {
        return slot;
    }

    public void setSlot(T newSlot) {
        this.slot = newSlot;
    }

}
