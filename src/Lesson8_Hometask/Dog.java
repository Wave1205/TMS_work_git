package Lesson8_Hometask;

//Zad8_2_star
public class Dog extends Animal {

    private static Dog dogInstance; // Статическая переменная для хранения экземпляра

    private Dog() {

    }

    public static Dog getDogInstance() { // Статический метод для получения экземпляра
        if (dogInstance == null) {
            dogInstance = new Dog();
        }
        return dogInstance;
    }

    public void voice() {
        System.out.println("Bark-bark ...");
    }

    public void eat(String food) {
        System.out.println("Eat everything, also "+ food);
    }
}