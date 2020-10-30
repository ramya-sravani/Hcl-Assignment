package Assignment4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Fourthpgrm {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numb = 0;
		try {

			do {
				System.out.println("Please enter a number or -1 to quit");
				numb = sc.nextInt();
				evenOdd(numb);
			} while (numb != -1);
			
			
		} catch (InputMismatchException e) {
			System.out.println("You have entered an integer");
		}
		
	}

	private static void evenOdd(int numb) {
		if (numb % 2 == 0) {
			System.out.println("even");
		} else if(numb%2!=0){
			System.out.println("odd");
		} else {
			System.exit(0);
		}
	}
}
