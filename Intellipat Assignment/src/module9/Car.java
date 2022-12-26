package module9;

public class Car extends Vehicle implements Booster {
public static void main(String[] args) {
	Car obj = new Car();
	obj.drive();
	obj.speed();
	obj.safety();
}

@Override
public void safety() {
System.out.println("Method without Body from Interface");	
}
}
