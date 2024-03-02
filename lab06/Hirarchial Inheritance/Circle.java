package lab06;

public class Circle extends GeometricShape {
    private double radius;

    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(String borderColor, boolean filled, double radius) {
        super(borderColor, filled);
        this.radius = radius;
    }

    public boolean setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
            return true;
        }
        return false;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + this.radius;
    }
}
