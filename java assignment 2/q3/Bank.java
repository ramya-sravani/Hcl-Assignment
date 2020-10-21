
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details to create bank account: ");
		String userName = sc.next();
		String accountType = sc.next();
		double initialBalance = sc.nextDouble();

		// if account type created is current account
		if (accountType.equals("Current")) {

			CurrentAccount current = new CurrentAccount(userName, initialBalance);
			System.out.println("Current account is created with details:");
			System.out.println(current.toString());

			while (true) {
				System.out.println("Enter 1 to deposit");
				System.out.println("Enter 2 to withdraw");
				System.out.println("Enter 3 to display balance");
				System.out.println("Enter 0 to exit");

				String balance;
				int depositAmount;
				int withdrawAmount;
				System.out.println("Enter your choice :");
				int num = sc.nextInt();

				switch (num) {
				case 1:
					System.out.println("Do you want to display balance (Yes/No) :");
					balance = sc.next();

					if (balance.equalsIgnoreCase("Yes")) {
						System.out.println("Current balance: ");
						current.getBalance();
						System.out.println("Enter amount to deposit :");
						depositAmount = sc.nextInt();
						current.deposit(depositAmount);
						System.out.println("Updated balance: ");
						current.getBalance();
					} else {
						System.out.println("Enter amount to deposit :");
						depositAmount = sc.nextInt();
						current.deposit(depositAmount);
					}
					break;

				case 2:
					System.out.println("Do you want to display balance (Yes/No) : ");
					balance = sc.next();

					if (balance.equals("Yes")) {
						System.out.println("Current balance: ");
						current.getBalance();
						System.out.println("Enter amount to withdraw :");
						withdrawAmount = sc.nextInt();
						current.withDraw(withdrawAmount);
						System.out.println("New balance: ");
						current.getBalance();
					} else {
						System.out.println("Enter amount to withdraw :");
						withdrawAmount = sc.nextInt();
						current.withDraw(withdrawAmount);
					}
					break;
				case 3:
					System.out.println("The current balance is: ");
					current.getBalance();
				default:
					break;
				}
				if (num == 0) {
					System.out.println("Exited!!");
					break;
				} else if (num > 3 || num < 0) {
					System.out.println("Enter correct option..");
				}
			}
		} else if (accountType.equals("Savings")) {

			SavingsAccount saving = new SavingsAccount(userName, initialBalance);
			System.out.println("Savings account created with the following details:");
			System.out.println(saving.toString());

			while (true) {
				System.out.println("Here is the menu!!");

				System.out.println("Enter 1 to deposit");
				System.out.println("Enter 2 to withdraw");
				System.out.println("Enter 3 to display balance");
				System.out.println("Enter 0 to exit");

				String balance;
				int depositAmount;
				int withdrawAmount;
				System.out.println("Enter :");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					System.out.println("Do you want to display balance (Yes/No) : ");
					balance = sc.next();

					if (balance.equalsIgnoreCase("yes")) {
						System.out.println("Current balance: ");
						System.out.println(saving.getAccountBalance());
						System.out.println("Enter amount to deposit: ");
						depositAmount = sc.nextInt();
						saving.deposit(depositAmount);
						System.out.println("New balance: ");
						System.out.println(saving.getAccountBalance());
					} else {
						System.out.println("Enter amount to deposit: ");
						depositAmount = sc.nextInt();
						saving.deposit(depositAmount);
					}
					break;

				case 2:
					System.out.println("Do you want to display balance (Yes/No) :");
					balance = sc.next();

					if (balance.equalsIgnoreCase("yes")) {
						System.out.println("Current balance: ");
						System.out.println(saving.getAccountBalance());
						System.out.println("Enter amount to withdraw");
						withdrawAmount = sc.nextInt();
						saving.withDraw(withdrawAmount);
						System.out.println("New balance: ");
						System.out.println(saving.getAccountBalance());
					} else {
						System.out.println("Enter amount to withdraw");
						withdrawAmount = sc.nextInt();
						saving.withDraw(withdrawAmount);
					}
					break;
				case 3:
					System.out.println(saving.getAccountBalance());
				default:
					break;
				}
				if (num == 0) {
					System.out.println("Exited!!");
					break;
				} else if (num > 3 || num < 0) {
					System.out.println("Enter correct option...");
				}
			}

		}
		sc.close();
	}


}
