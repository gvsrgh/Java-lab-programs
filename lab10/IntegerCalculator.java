package lab10;

public class IntegerCalculator implements calculator_1,calculator_2 {
	public int addition(int x,int y) {
		return x+y;
	}
	public int subtraction(int x, int y) {
		return x-y;
	}
	public int multiplication(int x,int y) {
		return x*y;
	}
	public int division(int x, int y) {
		return x/y;
	}
}