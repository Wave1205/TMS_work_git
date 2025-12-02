package Lesson15_Hometask;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Zad1_1
        arrayList();
        System.out.println();
        //Zad1_2
        linkedList();
        System.out.println();
        //Zad1_3
        hashSet();
        System.out.println();

        //Zad1_4
        Storage<Integer> integerStorage = new Storage<>(456);
        System.out.println(integerStorage.getSlot());
        integerStorage.setSlot(235);
        System.out.println(integerStorage.getSlot());

        Storage<String> StringStorage = new Storage<>();
        System.out.println(StringStorage.getSlot());
        StringStorage.setSlot("Mursic");
        System.out.println(StringStorage.getSlot());
        System.out.println();

        //Zad2_1
        string();
        System.out.println();

        //Zad2_2
        Animals animals = new Animals();
        animals.addAnimal("Cow");
        animals.addAnimal("Rabbit");
        animals.addAnimal("Cat");
        animals.addAnimal("Dog");
        animals.addAnimal("Bird");
        System.out.println(animals.getAnimals());

        animals.removeAnimal();
        System.out.println(animals.getAnimals());

        animals.removeAnimal();
        animals.removeAnimal();
        System.out.println(animals.getAnimals());

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
        for (String country : countries) {
            System.out.print(country + "  ");
        }
        //1.3 Заменить 2-й элемент.
        //.set(index,"")
        countries.set(1, "France");
        System.out.println("\nset: ");
        for (String country : countries) {
            System.out.print(country + "  ");
        }
        //1.4 Удалить его по индексу.
        //.remove(index)
        countries.remove(1);
        System.out.println("\nremove: ");
        for (String country : countries) {
            System.out.print(country + "  ");
        }
        //1.5 Удалить любой элемент по значению.
        //.remove("")
        countries.remove("Russia");
        System.out.println("\nremove: ");
        for (String country : countries) {
            System.out.print(country + "  ");
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

    //Zad2_1
    //Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
    //4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
    //При решении использовать коллекции.
    public static void string() {
        System.out.println("Give string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayList<String> elementsList = new ArrayList<String>();
        //input.trim();
        String[] elements = input.split(", ");

        /*for (String element : elements) {
            //elementsList.add(element);
            System.out.print(element + "  ");
        }*/

        System.out.println();
        elementsList.add(elements[0]);
        for (int i = 0, j = 1; i < elements.length && j < elements.length; i++, j++) {
            if (elements[i].equals(elements[j])) {

            } else {
                elementsList.add(elements[j]);
            }
        }

        for (String element : elementsList) {
            System.out.print(element + "  ");
        }
    }


}