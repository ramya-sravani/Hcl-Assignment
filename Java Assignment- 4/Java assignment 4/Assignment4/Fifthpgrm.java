package Assignment4;
import java.util.Scanner;
public class Fifthpgrm {
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)) {
			System.out.println("Please enter a number");
			int n = sc.nextInt();
			try {
				if(n > 100) {
					throw new Exception();
				}
			}catch (Exception e) {
				System.out.println("Number cannot be greater than 100");
			}
		}
	}
}
