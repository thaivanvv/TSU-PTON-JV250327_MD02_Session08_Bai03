import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.9);
        circle.setColor("red");
        Rectangle rectangle = new Rectangle(3,5);
        rectangle.setColor("Blue");
        Square square = new Square(3);
        square.setColor("Green");

        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("square Color: " + square.getColor());
    }
}