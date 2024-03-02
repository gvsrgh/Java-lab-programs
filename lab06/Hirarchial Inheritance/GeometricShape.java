package lab06;

public class GeometricShape {
	public String borderColor;
	public boolean filled;
	public GeometricShape()
	{
		
	}
	public GeometricShape(String borderColor, boolean filled)
	{
		this.borderColor = borderColor;
		this.filled = filled;
	}
	public boolean setBorder(String borderColor) {
		char c;
		for(int i = 0;i<borderColor.length();i++)
		{
			c = borderColor.charAt(i);
			if((c >='A' && c<='Z') || (c>='a' && c<='z'))
				continue;
			else
				return false;
		}
		this.borderColor = borderColor;
		return true;
	}
	public boolean setFilled(boolean filled) {
		this.filled = filled;
		return true;
	}
	public String getBorder()
	{
		return borderColor;
	}
	public boolean getFilled()
	{
		return filled;
	}
	public String toString()
	{
		return "Border Color: "+borderColor+"\nFilled: "+filled;
	}
}