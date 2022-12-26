package module5;

public class Intellipaat {
	public int x = 10;

	public Intellipaat(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
@Override
	public String toString() {
		return "Intellipaat [ x = " + x + "]";
	}

public static void main(String[] args) {
	Intellipaat i1 = new Intellipaat(10);
	System.out.println(i1);
	
}	
}
