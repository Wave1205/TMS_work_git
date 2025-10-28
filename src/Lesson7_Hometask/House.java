package Lesson7_Hometask;

public class House extends Build {
    public House() {
        type = "House";
    }

    public void getTypeOfHouse() {
        System.out.println("This is " + type);
    }

    public String sayHelloFromHouse(){
        return "Hello from House";
    }
}
