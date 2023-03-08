package org.lesson1;


public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x1 = 10;
        p.x2 = -3;
        p.y1 = 22;
        p.y2 = 1;
        System.out.println("Расстояние между точками X (" + p.x1 + ", " + p.y1 + ") и Y (" + p.x2 + ", " + p.y2 + ") = " + distance(p));
        System.out.println("Расстояние между точками X (" + p.x1 + ", " + p.y1 + ") и Y (" + p.x2 + ", " + p.y2 + ") = " + p.distance2());
    }

    public static double distance(Point p) {
        return Math.sqrt(Math.pow((p.x2 - p.x1), 2) + Math.pow((p.y2 - p.y1), 2));

    }
}