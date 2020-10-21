

public class Car extends Vehicle {
	private int noOfDoors;

	public Car(int model, String make, int noOfDoors) {
		super(model, make);
		this.noOfDoors = noOfDoors;
	}

	public Car(int model, String make) {
		super(model, make);
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public void display() {
		System.out.println("Make: " + getMake() + " ,Model: " + getModel() + " ,Number of doors: " + noOfDoors);
	}

}
