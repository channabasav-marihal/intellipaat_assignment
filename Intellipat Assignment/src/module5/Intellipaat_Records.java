package module5;

public class Intellipaat_Records {
	public String name;
	public int roll_number;
	public Intellipaat_Records(String name, int roll_number) {
		super();
		this.name = name;
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	
	@Override
	public String toString() {
		return "Intellipaat_Records [Name=" + name + ", Roll_number=" + roll_number + "]";
	}
	public static void main(String[] args) {
		Intellipaat_Records r1 = new Intellipaat_Records("Sagar", 101);
		System.out.println(r1);
	}
}
