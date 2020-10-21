

public class Convertible extends Car {
	boolean isHoodOpen;

	public Convertible(int model, String make, int numOfDoors, boolean isHoodOpen) {
		super(model, make, numOfDoors);
		this.isHoodOpen = isHoodOpen;
	}

	public void display() {
		System.out.println("Make: " + getMake() + " ,Model: " + getModel() + " ,Number of doors: " + getNoOfDoors()
				+ " 
}
}
