package Lesson13_Hometask;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
        //return "false";
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
