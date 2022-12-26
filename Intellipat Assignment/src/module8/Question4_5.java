package module8;

public class Question4_5 {
	public static void age(int age) {
		if (age < 18) {
			try {
				throw new ArithmeticException("Minimum age 18 to vote");
			} catch (Exception e) {
				System.out.println("Minimum age 18 to vote");
			}
		} else {
			System.out.println("You can Vote");
		}

	}

	public static void main(String[] args) {
		age(10);
	}

}
