package Lesson13_Hometask;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }

}
