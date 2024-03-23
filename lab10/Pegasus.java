package lab10;

public class Pegasus extends Animal implements Bird,Horse{
	public Pegasus(String name,int age) {
		super(age,name);
	}
	public void birdNoise() {
		System.out.println("Bird Noise");
	}
	public void horseNoise() {
		System.out.println("Horse Noise");
	}
	public static void main(String[]args) {
		Pegasus p = new Pegasus("Simba",369);
		p.birdNoise();
		p.horseNoise();
		System.out.println(p);
	}
}