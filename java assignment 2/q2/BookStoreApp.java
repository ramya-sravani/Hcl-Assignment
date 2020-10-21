
	import java.util.Scanner;

	public class BookStoreApp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			BookStore bs = new BookStore();
			System.out.println("Enter 1 to display books");
			System.out.println("Enter 2 to order new books");
			System.out.println("Enter 3 to sell books");
			System.out.println("Enter 0 to exit the syatem");
			System.out.println();

			while (true) {
				System.out.print("Enter the user input: ");
				int input = sc.nextInt();
				switch (input) {
				case 1:
					bs.display();
					break;
				case 2:
					bs.sell("Java Seventh Edition1", 1);
					break;
				case 3:
					bs.order("0070453", 2);
					break;
				default:
					return;
				}
				sc.close();
			}
		}
	}
	
