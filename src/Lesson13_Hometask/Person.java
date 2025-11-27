package Lesson13_Hometask;

public class Person {

    String fullName;
    int age;

    public Person(String fullName, int age) throws PersonAgeException{
        if (age >= 18) {
            System.out.println("Age is okay!");
            this.fullName = fullName;
            this.age = age;
        } else {
            throw new PersonAgeException("Person is under 18 years old!!!");
        }
    }

}