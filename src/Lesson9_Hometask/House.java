package Lesson9_Hometask;

public class House implements Cloneable {

    String type;
    double square;

    public House(String type, double square) {
        this.type = type;
        this.square = square;
    }

    //Поверхностное клонирование
    @Override
    public House clone() throws CloneNotSupportedException {
        return (House) super.clone();
    }

}
