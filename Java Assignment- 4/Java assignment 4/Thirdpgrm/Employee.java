package Thirdpgrm;
import java.io.Serializable;
public class Employee implements Serializable{
	
	private String name;
	private int id;
	private String address;
	private transient double salary;
	
	public Employee() {
	}

	public Employee(String name, int id, String address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("name: " + this.name + " id: " + this.id + " address: " + this.address + " salary: " + this.salary);
	}{

}
