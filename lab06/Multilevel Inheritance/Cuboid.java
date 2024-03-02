package lab06;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid() {
        super();
        this.height = 0.0;
    }

    public Cuboid(String borderColor, boolean filled, double length, double width, double height) {
        super(borderColor, filled, length, width);
        this.height = height;
    }

    public boolean setHeight(double height) {
        if (height >= 0) {
            this.height = height;
            return true;
        }
        return false;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return super.toString() + ", Height: " + this.height;
    }
}
