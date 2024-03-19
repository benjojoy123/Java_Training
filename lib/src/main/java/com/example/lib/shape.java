package com.example.lib;

    abstract class Shape {
        protected String color;

        // Constructor
        public Shape(String color) {
            this.color = color;
        }

        // Abstract method for calculating area
        public abstract double area();

        // Concrete method for displaying color
        public void displayColor() {
            System.out.println("Color: " + color);
        }
    }



    class Circle extends Shape {
        private double radius;

        // Constructor
        public Circle(String color, double radius) {
            super(color);//it will call the parent class constructor
            this.radius = radius;
        }

        // Implementation of abstract method area for Circle
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private double length;
        private double width;

        // Constructor
        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        // Implementation of abstract method area for Rectangle
        @Override
        public double area() {
            return length * width;
        }
    }


