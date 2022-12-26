package module7;

public class B extends A {
	public String a = "a";
	public String b = "b";

	public void parent(String a, String b) {
		System.out.println("From Child Class");
	}

	public static void main(String[] args) {

		B obj = new B();
		obj.parent();
		obj.parent("Sagar", "ZapCom");
	}

}
