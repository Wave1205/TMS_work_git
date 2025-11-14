package Lesson9_Hometask;

import static java.lang.Math.PI;

public class Circle extends Shape {

    //final double pi = 3.14;
    double r;
    double s;
    double P;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {
        return s = PI * r * r;
    }

    @Override
    public double perimeter() {
        return P = 2 * PI * r;
    }
}
