
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to create a vehicle object");
		System.out.println("Enter 2 to create a car object");
		System.out.println("Enter 3 to create a convertible object");
		System.out.println("Enter 4 to create a sport car object");

		System.out.println();
		System.out.println("Enter your choice: ");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			Vehicle vehicle = new Vehicle(4, 0, 2016, "Swift");
			vehicle.display();
			break;
		case 2:
			Car car = new Car(2017, "Ferari", 2);
			car.display();
			break;
		case 3:
			Convertible convertible = new Convertible(2018, "Mahindra", 4, true);
			convertible.display();
			break;
		case 4:
			SportCar sportCar = new SportCar(2019, "BMW");
			sportCar.display();
			break;
		default:
			break;
		}
		sc.close();
	}

}
