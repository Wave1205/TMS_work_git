package Lesson8_Hometask;

public class Tiger extends Animal {

    public void voice() {
        System.out.println("ROOOAAAAARRR ...");
    }

    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Love's " + food);
        } else {
            System.out.println("Doesn't love " + food);
        }
    }

}
