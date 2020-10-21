
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, id, str;
		int year;
		double grade;
		Scanner obj = new Scanner(System.in);
		Student s;
		System.out.println("Enter 1 if you want to give details name,id and grade");
		System.out.println("Enter 2 if you want to give details name and id");
		System.out.println("Enter 3 if you want to give only id");
		System.out.println();
		System.out.println("Enter your choice: ");
		int input = obj.nextInt();
		switch (input) {
		case 1:
			System.out.println("Enter name: ");
			name = obj.next();
			System.out.println("Enter id: ");
			id = obj.next();
			System.out.println("Enter grade: ");
			grade = obj.nextDouble();
			s = new Student(name, id, grade);
			System.out.println("If you want to enter year: (yes/no) ");
			str = obj.next();
			if (str == "yes") {
				System.out.println("Enter year: ");
				year = obj.nextInt();
				s.display(year);
			} else
				s.display();
			break;
		case 2:
			System.out.println("Enter name: ");
			name = obj.next();
			System.out.println("Enter id: ");
			id = obj.next();
			s = new Student(name, id);
			System.out.println("If you want to enter year: (yes/no) ");
			str = obj.next();
			if (str == "yes") {
				System.out.println("Enter year: ");
				year = obj.nextInt();
				s.display(year);
			} else
				s.display();
			break;
		case 3:
			System.out.println("Enter id: ");
			id = obj.next();
			s = new Student(id);
			System.out.println("If you want to enter year: (yes/no) ");
			str = obj.next();
			if (str == "yes") {
				System.out.println("Enter year: ");
				year = obj.nextInt();
				s.display(year);
			} else
				s.display();
			break;
		default:
			System.out.println("Please enter correct option..");
			break;
		}
		obj.close();
	}

}
