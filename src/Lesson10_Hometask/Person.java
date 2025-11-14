package Lesson10_Hometask;

public class Person implements Cloneable {
    public String fullName;
    int age;
    double salary;
    Cat cat;

    public Person(String fullName, int age, double salary, Cat cat) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return ("Full name: " + this.fullName +
                ", age: " + this.age +
                ", salary: " + this.salary +
                ", Cat: " + this.cat
        );
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public int hashCode() {
        int hashFullName = fullName.hashCode();
        int hashSalary = (int)salary;
        int hash = hashSalary * hashFullName * age;
        return hash;
    }
}
