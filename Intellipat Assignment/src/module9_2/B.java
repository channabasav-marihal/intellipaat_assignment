package module9_2;

public interface B extends A {
	public default void display2() {
		System.out.println("From B");
	}
}
