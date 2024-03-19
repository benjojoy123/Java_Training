package com.example.lib;

public class Myclass2 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Circle Area: " + circle.area());
        circle.displayColor();

        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.area());
        rectangle.displayColor();
    }

}
