package Lesson10_Hometask;

public class Cat {

    String name;
    String breed; //порода

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return (" name: " + this.name +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t breed: " + this.breed
        );
    }

}
