package Lesson9_Hometask;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    double a, b, c;
    double s;
    double P;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //S = √p · (p — a)(p — b)(p — c),    //Only for existing Triangle, p > a or b or c
    @Override
    public double square() {
        return s = sqrt((perimeter() / 2) *
                (perimeter() / 2 - a) *
                (perimeter() / 2 - b) *
                (perimeter() / 2 - c));
    }

    @Override
    public double perimeter() {
        return P = a + b + c;
    }
}