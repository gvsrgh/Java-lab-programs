package lab07;

public class Cuboid extends Rectangle3 {
    private double height;

    public Cuboid(String borderColor, boolean filled, double length, double width, double height) {
        super(borderColor, filled, length, width);
        this.height = height;
    }

    @Override
    public double area() {
        return length*width*height;
    }
}
