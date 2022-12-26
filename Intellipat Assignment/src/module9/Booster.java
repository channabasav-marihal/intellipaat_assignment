package module9;

public interface Booster {
	public default void speed() {
		System.out.println("Booster - from Interface");
	}
	public void safety();

}
