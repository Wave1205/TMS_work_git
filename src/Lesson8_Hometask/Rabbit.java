package Lesson8_Hometask;

public class Rabbit extends Animal {

    //squeak
    public void voice() {
        System.out.println("Squeak-squeak ...");
    }

    public void eat(String food) {
        if (food == "Grass" || food == "Carrot") {
            System.out.println("Love's " + food);
        } else {
            System.out.println("Doesn't love " + food);
        }
    }

}
