package Sixthpgrm;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number");
			int n = sc.nextInt();
			try {
				if(n > 100) {
					throw new InputException("Number cannot be greater than 100");
				}
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
