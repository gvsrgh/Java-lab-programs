package lab06;

public class Rectangle extends GeometricShape{
	public double length;
	public double width;
	public Rectangle()
	{
		
	}
	public Rectangle(String borderColor,boolean filled,double length,double width) {
		super(borderColor,filled);
		this.length = length;
		this.width = width;
	}
	public boolean setLength(double length) {
		if(length > 0)
		{
			this.length = length;
			return true;
		}
		return false;
	}
	public boolean setWidth(double width) {
		if(width>0)
		{
			this.width = width;
			return true;
		}
		return false;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public String toString() {
		return super.toString() +"\nLength: "+length+"\nWidth: "+width;
	}
}