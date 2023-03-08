package org.lesson1;

public class Point {
    public double x1, y1, x2, y2;

    public double distance2() {
        return Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));

    }
}