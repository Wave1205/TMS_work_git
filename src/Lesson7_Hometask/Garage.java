package Lesson7_Hometask;

public class Garage extends Build {
    public Garage() {
        type = "Garage";
    }

    public void getTypeOfGarage() {
        System.out.println("This is " + type);
    }

    public String sayHelloFromGarage(){
        return "Hello from Garage";
    }
}
