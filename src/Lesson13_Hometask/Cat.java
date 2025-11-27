package Lesson13_Hometask;

public class Cat {

    String name;
    int age;

    public Cat(String name, int age) throws CatAgeException {
        if (age <= 20) {
            System.out.println("Age is okay!");
            this.name = name;
            this.age = age;
        } else {
            throw new CatAgeException("Cat is older then 20 years!!!");
        }
    }

    public void eat(String food) throws CatFoodException {
        if (food == "Meat" || food == "Fish" || food == "Water") {
            System.out.println("Cat loves eat " + food);
        } else {
            throw new CatFoodException("Cat can't eat " + food);
        }
    }

    public void molting(boolean IsSpring) throws CatMoultException {
        if (IsSpring == true) {
            System.out.println("Cat is molting. Help!");
        } else {
            throw new CatMoultException("Save");
        }
    }

    public int catAges() {
        //N = 24 + (n - 2) x 4
        int catAge = 24 + (this.age - 2) * 4;
        return catAge;
    }

}
