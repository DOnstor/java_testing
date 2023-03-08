package org.example;


public class Main {
    public static void main(String[] args) {
        hello();
sum();

    }
    public static void hello(){
        System.out.println("Hello world!");
    }
    public static void sum() {
        Point p = new Point(2,4);
        System.out.println(p.sum());

    }
}