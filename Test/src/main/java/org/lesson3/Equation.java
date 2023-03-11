package org.lesson3;

public class Equation {
    private final int n;

    public Equation(double a, double b, double c) {

        double d = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    n = -1;
                } else {
                    n = 0;
                }
            } else {
                n = 1;
            } ;

        } else {
            if (d > 0) {
                n = 2;
            } else if (d == 0) {
                n = 1;
            } else {
                n = 0;
            }
        }
    }

    public int rootNumber() {
        return n;
    }
}