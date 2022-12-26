package module7;

public class Car extends Vehicle {

	public void driveCar() {
		System.out.println("Dont Drive Fast");
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
	}
}
