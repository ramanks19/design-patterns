package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
    }
    
}
