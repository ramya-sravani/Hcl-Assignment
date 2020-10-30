package Thirdpgrm;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class BankAccount {
	public static void main(String[] args) {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tester3.ser"));
			Employee employee = new Employee("Divya", 51894811, "A.p", 22000.0);
			oos.writeObject(employee);
			employee.display();
			System.out.println("data successfully serialized..!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("tester3.ser"));
			Employee employeeObj = (Employee) ois.readObject();
			employeeObj.display();
			System.out.println("deserialized data successfully....!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
