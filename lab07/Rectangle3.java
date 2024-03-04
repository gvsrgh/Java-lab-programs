package lab07;

public class Rectangle3 extends GeometricShape3 {
    protected double length;
    protected double width;

    public Rectangle3(String borderColor, boolean filled, double length, double width) {
        super(borderColor, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
