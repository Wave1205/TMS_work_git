package Lesson7_Hometask;

public class Person {

    public String fullname;
    int age;
    private String gender;

    public Person () {
        this.fullname = "Maria";
        this.age = 29;
        this.gender = "F";
    }

    public Person (String fullname, int age, String gender) {
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
    }

    public void getName() {
        System.out.println(fullname);
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getGender() {
        System.out.println(gender);
    }

    public void getAll() {
        System.out.println(fullname + "  " + age + "  " + gender);
    }

}
