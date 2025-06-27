import java.awt.*;

public class Rectangle implements Colorable{
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
