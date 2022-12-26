package module9;

public class Sonet  extends Kia{
	public static void main(String[] args) {
		Sonet sonet = new Sonet();
		sonet.lights();
	}

	@Override
	public void lights() {
System.out.println("Neon LED lights - from abstract class");		
	}

}
