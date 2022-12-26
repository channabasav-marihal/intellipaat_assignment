package module9;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.display();
		B b = new B();
		b.display();
		C c = new C();
		c.display();

		A a2;
		a2 = b;
		a2.display();
		a2 = c;
		a2.display();
		B b2 = c;
		b2.display();

	}
}
