import java.util.Random;

public class Account {
	private String memberName;
	private double accountBalance;

	Random random = new Random();
	private String accountNumber = "" + random.nextInt(10) + random.nextInt(10) + random.nextInt(10)
			+ random.nextInt(10) + random.nextInt(10);

	public Account(String memberName, double accountBalance) {
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposit(double amount) {
		setAccountBalance(getAccountBalance() + amount);
	}

	@Override
	public String toString() {
		return "Account [memberName=" + memberName + ", accountBalance=" + accountBalance + ", accountNumber="
				+ accountNumber + "]";
	}

}
