package Lesson9_Hometask;

public class Square extends Shape {

    double a, s, P;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double square() {
        return s = a * a;
    }

    @Override
    public double perimeter() {
        return P = 4 * a;
    }
}

