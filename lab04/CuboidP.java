package lab04;

public class CuboidP {
    private double length;
    private double breadth;
    private double height;

    public boolean setLength(double length) {
        if (length > 0) {
            this.length = length;
            return true;
        }
        return false;
    }

    public boolean setBreadth(double breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
            return true;
        }
        return false;
    }

    public boolean setHeight(double height) {
        if (height > 0) {
            this.height = height;
            return true;
        }
        return false;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return length * breadth * height;
    }

    public String toString() {
        return "Length: " + getLength() + " m\nBreadth: " + getBreadth() + " m\nHeight: " + getHeight() + " m\nVolume: "
                + getVolume() + " cu.m";
    }
    
}
