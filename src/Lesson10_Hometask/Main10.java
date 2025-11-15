package Lesson10_Hometask;

public class Main10 {
    public static void main(String[] args) throws CloneNotSupportedException{
    //Lesson_10_Zad_1_1
    //1.1 Создать класс Person с 3-мя полями (имя, возраст, зарплата).
    //1.2 Переопределить для этого класса hashCode(придумать свою формулу), toString(чтобы
    //выдавал всю информацию по человеку).
    //1.3 Создать класс Cat и добавить в Person поле этого типа (Cat). Соответственно изменить toString().
    //1.4 В main создать объект Person, клонировать его, и поменять для копии имя. Проверить в консоли
    // с помощью toString что имена оригинала и копии действительно разные.
    //Сравнить объекты между собой используя equals.
    Person person = new Person("Maria", 23, 2000, new Cat("Milly", "Maine Coon"));
    Person clonedPerson = person.clone();

    Boolean result = person.equals(clonedPerson);                 //Why?????
    System.out.println(result);

    System.out.println("Hash code of person " + person.hashCode());
    System.out.println("Hash code of clonedPerson " + clonedPerson.hashCode());

    clonedPerson.fullName = "Vasya";
    System.out.println(person.toString());
    System.out.println(clonedPerson.toString());

    System.out.println("Hash code of person " + person.hashCode());
    System.out.println("Hash code of clonedPerson " + clonedPerson.hashCode());

    result = person.equals(clonedPerson);
    System.out.println(result);

    //Lesson_10_Zad_2_1
    //Создать класс для описания пользователя системы. Переопределить в классе методы
    //toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
    //значением полей и сравнить с помощью метода equals.
        User user1 = new User(1, "user@mail.ru","admin","active");
        User user2 = new User(1, "user@mail.ru","admin","active");
        User user3 = new User(3, "user3@mail.ru","user","closed");
        System.out.println("user1 data: \n" + user1.toString());
        System.out.println("user2 data: \n" + user2.toString());
        System.out.println("user1 hashcode: " + user1.hashCode());
        System.out.println("user2 hashcode: " + user2.hashCode());
        System.out.println("Is user1 equals user2? " + user1.equals(user2));
        System.out.println("Is user1 equals user3? " + user1.equals(user3));
    //Lesson_10_Zad_2_star
    //Создать программу для реализации поверхностного и глубокого клонирования объекта
    //класса User. Пусть на вход программе будет передаваться тип операции клонирования
    //(поверхностное клонирование или глубокое), а также id юзера для клонирования.

    }
}
