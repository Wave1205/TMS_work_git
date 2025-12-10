package Lesson14_Hometask;

import java.io.Serializable;

public class Student  implements Serializable {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student() {

    }

    public void getStudent() {
        System.out.println("Name: " + name + " course: " + course);
    }

}
