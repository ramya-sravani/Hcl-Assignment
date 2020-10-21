
 public class CurrentAccount extends Account {
	private int tradeLicenseNumber;

	public CurrentAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}

	public void getBalance() {
		System.out.println(getAccountBalance());
	}

	public void withDraw(double amount) {
		if ((getAccountBalance() - amount) >= 1000) {
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}

}
