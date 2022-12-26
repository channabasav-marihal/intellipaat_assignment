package module8;

public class Question1 {
	static int a = 10;
	static int b = 0;

	public static void main(String[] args) {

		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Not divisible by 0");
		}

	}
}