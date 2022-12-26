package module5;

public class Addition {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(int a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		double d = 10.5;
		System.out.println(Addition.add(a, b));
		System.out.println(Addition.add(a, b, c));
		System.out.println(Addition.add(a, d));
	}
}
