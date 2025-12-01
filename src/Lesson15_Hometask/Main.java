package Lesson15_Hometask;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        arrayList();
        System.out.println();
        linkedList();
        System.out.println();
        hashSet();

    }

    //Zad1_1
    public static void arrayList() {
        //1.1 Создать коллекцию ArrayList стран мира.
        ArrayList<String> countries = new ArrayList<String>();
        //1.2 Добавить к этому cписку 3 страны, вывести результат в консоль.
        //.add()
        countries.add("Belarus");
        countries.add("China");
        countries.add("Russia");
        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i) + "  ");
        }
        //1.3 Заменить 2-й элемент.
        //.set(index,"")
        countries.set(1, "France");
        System.out.println("\nset: ");
        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i) + "  ");
        }
        //1.4 Удалить его по индексу.
        //.remove(index)
        countries.remove(1);
        System.out.println("\nremove: ");
        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i) + "  ");
        }
        //1.5 Удалить любой элемент по значению.
        //.remove("")
        countries.remove("Russia");
        System.out.println("\nremove: ");
        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i) + "  ");
        }
        //1.6 Узнать индекс любого элемента.
        //.indexOf("")
        int index = countries.indexOf("Belarus");
        //System.out.println(countries.get(index));
        System.out.println(index);
        //1.7 Проверить, содержится ли элемент в коллекции (любой).
        //.contains("")
        System.out.println(countries.contains("Belarus"));
        System.out.println(countries.contains("Russia"));
    }

    //Zad1_2
    public static void linkedList() {
        //2.1 Создать двусвязный список стран мира.
        LinkedList<String> countries = new LinkedList<String>();
        //2.2 Добавить к этому списку 4 страны (2 в начало и 2 в конец), вывести результат в
        //консоль (Использовать методы addFirst/addLast).
        countries.addFirst("Belarus");
        countries.addFirst("Russia");
        countries.addLast("France");
        countries.addLast("Poland");
        System.out.println(countries);
        //2.3 Удалить по одному элементу из начала и из конца списка.
        //.removeFirst();
        //.removeLast();
        countries.removeFirst();
        countries.removeLast();
        System.out.println(countries);
        //2.4 Получить по одному элементу из начала и из конца списка.
        //.getFirst()
        //.getLast()
        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());
    }

    //Zad1_3
    public static void hashSet() {
        //3.2 Создать HashSet в классе Main.
        HashSet people = new HashSet();
        //3.3 Добавить к этому списку 3 объекта Person, вывести результат используя for each.
        //.add("")
        Person person1 = new Person();
        System.out.println(person1);
        Person person2 = new Person();
        System.out.println(person2);
        Person person3 = new Person();
        System.out.println(person3);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        //people.add("Tom");
        //people.add("Jerry");
        people.forEach(person -> System.out.println(person));
        //3.4 Удалить 2 объекта из коллекции.
        //.remove("")
        people.remove(person1);
        people.remove(person2);
        people.forEach(person -> System.out.println(person));
        //3.5 Проверить, содержится ли оставшийся объект в коллекции.
        //.contains("")
        System.out.println(people.contains(person3));
        System.out.println(people.contains(person2));
    }

    //Zad1_4
    //Создать дженерик класс Storage с полем того типа который передаем в дженерик при
    //создании объекта. Сделать конструктор по дефолту и конструктор с этим полем.
    //Добавить геттеры/сеттеры. В методе main создать 2 объекта на основе этого дженерика и
    //проверить их работу.

}

//создать коллекцию Arraylist стран мира
//добавить к этому списку 3 страны вывести результаты в консоль
//заменить второй элемент
//list.get(0) size set(1, "")

//удалить его по индексу
//удалить любой элемент по значению
//узнать индекс любого элемента
//проверить содержится ли элемент в коллекции любой
//contains
